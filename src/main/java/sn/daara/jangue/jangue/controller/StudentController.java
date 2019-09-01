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
public class StudentController {
    private Logger logger = Logger.getLogger("StudentBusinesss");

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private LevelRepository levelRepository;

    @Autowired
    private LevelStudentRepository levelStudentRepository;

    @GetMapping(path = "/welcome")
    String home() {
        return "index";
    }

    @GetMapping(path = "/save")
    void saveStudent() {

        logger.info(".... start saving students  !!!");


        Student student1 = new Student("A011", "Mousa", "FALL", 'M', "Pere FALL", 774025240, null);
//        Student student2 = new Student("A002", "Rahim", "Nouraly", 'M', "Pere Nouraly", 774112141, null);
//        Student student3 = new Student("A003", "Hadj", "SEYE", 'M', "Pere SEYE", 775441424, null);
//        Student student4 = new Student("A004", "Fatou", "NDIAYE", 'F', "Pere NDIAYE", 778542696, null);

        List<Level> levelList = levelRepository.findAll();
//        List<Level> firstLevelList = new ArrayList<>();
//        firstLevelList.add(levelList.get(0));
        student1.getLevels().add(levelList.get(1));

        LevelStudent levelStudent = new LevelStudent(
                student1.getLevels().get(0).getLevelName(), null, student1.getMatricule(), 3500, null, null
        );
        logger.info("level=" + student1.getLevels().get(0).getLevelName());
        logger.info("montant=" + levelStudent.getMountant());
        logger.info("matricule=" + student1.getMatricule());

        studentRepository.save(student1);
        //levelStudentRepository.save(levelStudent);

        logger.info(" =========>=====================> student saved !!!");
        logger.info("....................................student level saved !");
    }


}
