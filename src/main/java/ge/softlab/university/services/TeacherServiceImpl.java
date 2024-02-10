package ge.softlab.university.services;

import ge.softlab.university.entities.Students;
import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.TeacherAddModel;
import ge.softlab.university.repositories.TeacherRepository;
import lombok.AllArgsConstructor;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    @Override
    public Teachers teacheradd(TeacherAddModel teacherAddModel) {
        Teachers teachers = new Teachers();
        teachers.setFirstName(teacherAddModel.firstName());
        teachers.setLastName(teacherAddModel.lastName());
        teachers.setPerNumber(teacherAddModel.perNumber());
        teachers.setEmail(teacherAddModel.email());
        teachers.setPhone(teacherAddModel.phone());
        teacherRepository.save(teachers);

        return teachers;
    }

    @Override
    public ResponseEntity<Teachers> teacherupdate(Integer Id, TeacherAddModel teacherAddModel) {
        Teachers teacherupdate = teacherRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("teacher not found for this id"));
        teacherupdate.setFirstName(teacherAddModel.firstName());
        teacherupdate.setLastName(teacherAddModel.lastName());
        teacherupdate.setPerNumber(teacherAddModel.perNumber());
        teacherupdate.setEmail(teacherAddModel.email());
        teacherupdate.setPhone(teacherAddModel.phone());
        teacherRepository.save(teacherupdate);

        return ResponseEntity.ok(teacherupdate);
    }

    @Override
    public ResponseEntity<Teachers> teachertdelete(Integer Id) {
        Teachers teacherdelete = teacherRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("student not found for this id"));
        teacherRepository.deleteById(Id);
        return (ResponseEntity<Teachers>) ResponseEntity.ok();
    }

    @Override
    public List<Teachers> searchteacher(String firstName) {
        List<Teachers> allbyfirstname = teacherRepository.findAllByfirstName(firstName);
        return allbyfirstname;
    }
}
