package ge.softlab.university.services;

import ge.softlab.university.entities.Students;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public Students studentadd(StudentAddModel studentAddModel) {
        Students students = new Students();
        students.setFirstName(studentAddModel.firstName());
        students.setLastName(studentAddModel.lastName());
        students.setPerNumber(studentAddModel.perNumber());
        students.setEmail(studentAddModel.email());
        students.setPhone(studentAddModel.phone());
        studentRepository.save(students);

        return students;

    }
}
