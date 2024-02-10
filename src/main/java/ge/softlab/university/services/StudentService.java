package ge.softlab.university.services;

import ge.softlab.university.entities.Students;
import ge.softlab.university.models.StudentAddModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    Students studentadd(StudentAddModel studentAddModel);

    ResponseEntity<Students> studentupdate(Integer Id, StudentAddModel studentAddModel);

   ResponseEntity<Students> studentdelete(Integer Id);

    /* void studentdeleteid(Integer Id);*/
}
