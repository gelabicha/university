package ge.softlab.university.controllers;

import ge.softlab.university.entities.Students;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class StudentController {
    private final StudentService studentService;
    @PostMapping("studentadd")
    public Students studentadd(@RequestBody StudentAddModel studentAddModel){
        return studentService.studentadd(studentAddModel);
    }

}
