package ge.softlab.university.services;

import ge.softlab.university.entities.Students;
import ge.softlab.university.models.StudentAddModel;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    Students studentadd(StudentAddModel studentAddModel);
}
