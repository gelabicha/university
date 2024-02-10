package ge.softlab.university.controllers;

import ge.softlab.university.entities.Students;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class StudentController {
    private final StudentService studentService;
    @PostMapping("studentadd")
    public Students studentadd(@RequestBody StudentAddModel studentAddModel){
        return studentService.studentadd(studentAddModel);
    }
    @PutMapping("studentupdate/{Id}")
    public ResponseEntity<Students> studentupdate(@PathVariable Integer Id, @RequestBody StudentAddModel studentAddModel){
        return studentService.studentupdate(Id,studentAddModel);
    }

    @DeleteMapping("studentdelete/{Id}")
    public  ResponseEntity<Students> studentdelete(@PathVariable("Id") Integer Id){
       return studentService.studentdelete(Id);
    }

    @GetMapping("searchstudent")
    public List<Students> search (String firstName){
        return studentService.searchstudent(firstName);
    }

}
