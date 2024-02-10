package ge.softlab.university.services;

import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.TeacherAddModel;
import ge.softlab.university.repositories.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    @Override
    public Teachers studentadd(TeacherAddModel teacherAddModel) {
        Teachers teachers = new Teachers();
        teachers.setFirstName(teacherAddModel.firstName());
        teachers.setLastName(teacherAddModel.lastName());
        teachers.setPerNumber(teacherAddModel.perNumber());
        teachers.setEmail(teacherAddModel.email());
        teachers.setPhone(teacherAddModel.phone());
        teacherRepository.save(teachers);

        return teachers;
    }
}
