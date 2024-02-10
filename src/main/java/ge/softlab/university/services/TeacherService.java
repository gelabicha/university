package ge.softlab.university.services;

import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.TeacherAddModel;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {
    Teachers studentadd(TeacherAddModel teacherAddModel);
}
