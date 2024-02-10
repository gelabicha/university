package ge.softlab.university.services;

import ge.softlab.university.entities.Students;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public ResponseEntity<Students> studentupdate(Integer Id, StudentAddModel studentAddModel) {
        Students studentupdate = studentRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("student not found for this id"));
        studentupdate.setFirstName(studentAddModel.firstName());
        studentupdate.setLastName(studentAddModel.lastName());
        studentupdate.setPerNumber(studentAddModel.perNumber());
        studentupdate.setEmail(studentAddModel.email());
        studentupdate.setPhone(studentAddModel.phone());
        studentRepository.save(studentupdate);

        return ResponseEntity.ok(studentupdate);
    }

    @Override
    public  ResponseEntity<Students> studentdelete(Integer Id) {
        Students studentdelete = studentRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("student not found for this id"));
        studentRepository.deleteById(Id);
        return (ResponseEntity<Students>) ResponseEntity.ok();
    }

    @Override
    public List<Students> searchstudent(String firstName) {
        List<Students> allbyfirstname = studentRepository.findAllByfirstName(firstName);
        return allbyfirstname;
    }

}
