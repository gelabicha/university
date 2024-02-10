package ge.softlab.university.controllers;

import ge.softlab.university.entities.Students;
import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.models.TeacherAddModel;
import ge.softlab.university.services.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;
    @PostMapping("teacheradd")
    public Teachers teacheradd(@RequestBody TeacherAddModel teacherAddModel){
        return teacherService.teacheradd(teacherAddModel);
    }
    @PutMapping("teacherupdate/{id}")
    public ResponseEntity<Teachers> teacherupdate(@PathVariable Integer Id, @RequestBody TeacherAddModel teacherAddModel){
        return teacherService.teacherupdate(Id,teacherAddModel);
    }
}
