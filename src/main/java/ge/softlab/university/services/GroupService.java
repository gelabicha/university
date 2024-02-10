package ge.softlab.university.services;

import ge.softlab.university.entities.Groups;
import ge.softlab.university.models.GroupAddModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface GroupService {
    Groups groupadd(GroupAddModel groupAddModel);

    ResponseEntity<Groups> groupupdate(Integer Id, GroupAddModel groupAddModel);
}
