package ge.softlab.university.services;

import ge.softlab.university.entities.Groups;
import ge.softlab.university.entities.Students;
import ge.softlab.university.entities.Teachers;
import ge.softlab.university.models.GroupAddModel;
import ge.softlab.university.repositories.GroupRepository;
import lombok.AllArgsConstructor;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;
    @Override
    public Groups groupadd(GroupAddModel groupAddModel) {
        Groups groups = new Groups();
        groups.setGroupId(groupAddModel.groupId());
        groups.setStudentId(groupAddModel.studentId());
        groups.setTeacherId(groupAddModel.teacherId());
        groupRepository.save(groups);

        return groups;
    }

    @Override
    public ResponseEntity<Groups> groupupdate(Integer Id, GroupAddModel groupAddModel) {
        Groups groupupdate = groupRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("group not found for this id"));
        groupupdate.setGroupId(groupAddModel.groupId());
        groupupdate.setStudentId(groupAddModel.studentId());
        groupupdate.setTeacherId(groupAddModel.teacherId());
        groupRepository.save(groupupdate);
        return ResponseEntity.ok(groupupdate);
    }

    @Override
    public ResponseEntity<Groups> groupdelete(Integer Id) {
        Groups groupdelete = groupRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("student not found for this id"));
        groupRepository.deleteById(Id);
        return (ResponseEntity<Groups>) ResponseEntity.ok();
    }

    @Override
    public List<Groups> searchegroup(Integer Id) {
        List<Groups> allbyId = groupRepository.findAllById(Id);
        return allbyId;
        }

    @Override
    public List<Groups> searchGroup(Integer groupId) {
        List<Groups> allbyGroup = groupRepository.findAllByGroupId(groupId);
        return allbyGroup;
    }

}
