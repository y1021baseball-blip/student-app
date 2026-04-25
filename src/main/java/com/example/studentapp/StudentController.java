import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String list(Model model) {

        List<String> students = new ArrayList<>();
        students.add("山田太郎");
        students.add("佐藤花子");
        students.add("鈴木一郎");

        model.addAttribute("students", students);

        return "students";
    }
}