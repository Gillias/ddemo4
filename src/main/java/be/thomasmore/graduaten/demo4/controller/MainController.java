package be.thomasmore.graduaten.demo4.controller;

import be.thomasmore.graduaten.demo4.entity.Student;
import be.thomasmore.graduaten.demo4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/data")
    public String data(ModelMap model) {
        Student firstStudent = studentService.retrieveStudents().get(0);
        model.put("student", firstStudent);
        return "data";
    }
}
