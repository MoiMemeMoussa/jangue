package sn.daara.jangue.jangue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.daara.jangue.jangue.model.Level;
import sn.daara.jangue.jangue.model.LevelStudent;
import sn.daara.jangue.jangue.model.Student;
import sn.daara.jangue.jangue.repository.LevelRepository;
import sn.daara.jangue.jangue.repository.LevelStudentRepository;
import sn.daara.jangue.jangue.repository.StudentRepository;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(path = "/daara")
public class LoginController {
    Logger logger = Logger.getLogger("LoginController");

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping(path = "/index")
    String home() {
        return "login";
    }


}
