package ge.softlab.university.controllers;

import ge.softlab.university.entities.Students;
import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.models.TeacherAddModel;
import ge.softlab.university.services.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;
    @PostMapping("teacheradd")
    public Teachers teacheradd(@RequestBody TeacherAddModel teacherAddModel){
        return teacherService.teacheradd(teacherAddModel);
    }
    @PutMapping("teacherupdate/{Id}")
    public ResponseEntity<Teachers> teacherupdate(@PathVariable Integer Id, @RequestBody TeacherAddModel teacherAddModel){
        return teacherService.teacherupdate(Id,teacherAddModel);
    }
    @DeleteMapping("teachertdelete/{Id}")
    public  ResponseEntity<Teachers> teachertdelete(@PathVariable("Id") Integer Id){
        return teacherService.teachertdelete(Id);
    }
    @GetMapping("searchteacher")
    public List<Teachers> search (String firstName){
        return teacherService.searchteacher(firstName);
    }
}
