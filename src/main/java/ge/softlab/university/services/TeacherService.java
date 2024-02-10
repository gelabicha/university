package ge.softlab.university.services;

import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.TeacherAddModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    Teachers teacheradd(TeacherAddModel teacherAddModel);

    ResponseEntity<Teachers> teacherupdate(Integer Id, TeacherAddModel teacherAddModel);

    ResponseEntity<Teachers> teachertdelete(Integer Id);

    List<Teachers> searchteacher(String firstName);
}
