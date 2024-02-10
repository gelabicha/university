package ge.softlab.university.services;

import ge.softlab.university.entities.Groups;
import ge.softlab.university.models.GroupAddModel;
import ge.softlab.university.repositories.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;
    @Override
    public Groups groupadd(GroupAddModel groupAddModel) {
        Groups groups = new Groups();
        groups.setStudentId(groupAddModel.studentId());
        groups.setTeacherId(groupAddModel.teacherId());
        groupRepository.save(groups);

        return groups;
    }
}
