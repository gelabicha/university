package ge.softlab.university.controllers;

import ge.softlab.university.entities.Students;
import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.models.TeacherAddModel;
import ge.softlab.university.services.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;
    @PostMapping("teacheradd")
    public Teachers teacheradd(@RequestBody TeacherAddModel teacherAddModel){
        return teacherService.studentadd(teacherAddModel);
    }
}
