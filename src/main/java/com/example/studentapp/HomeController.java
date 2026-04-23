package com.example.studentapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    List<Student> studentList = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {

        studentList.sort((a,b) -> Double.compare(b.getAverage(), a.getAverage()));
        model.addAttribute("student", new Student());
        model.addAttribute("students", studentList);
        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentList.add(student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam int index){
        studentList.remove(index);
        return"redirect:/";
    }
}