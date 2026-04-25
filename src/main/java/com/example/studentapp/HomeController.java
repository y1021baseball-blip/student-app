package com.example.studentapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private final StudentRepository repository;

    public HomeController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("students", repository.findAll());

        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        repository.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam Long id){
        repository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", repository.findAll());
        return "students";
    }
}