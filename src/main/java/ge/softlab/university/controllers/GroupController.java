package ge.softlab.university.controllers;

import ge.softlab.university.entities.Groups;
import ge.softlab.university.models.GroupAddModel;
import ge.softlab.university.services.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class GroupController {
    private final GroupService groupService;
    @PostMapping("groupadd")
    public Groups groupadd(@RequestBody GroupAddModel groupAddModel){
        return groupService.groupadd(groupAddModel);
    }
}
