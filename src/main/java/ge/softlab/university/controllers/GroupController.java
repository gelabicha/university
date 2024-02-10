package ge.softlab.university.controllers;

import ge.softlab.university.entities.Groups;
import ge.softlab.university.entities.Students;
import ge.softlab.university.models.GroupAddModel;
import ge.softlab.university.models.StudentAddModel;
import ge.softlab.university.services.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class GroupController {
    private final GroupService groupService;
    @PostMapping("groupadd")
    public Groups groupadd(@RequestBody GroupAddModel groupAddModel){
        return groupService.groupadd(groupAddModel);
    }
    @PutMapping("groupupdate/{id}")
    public ResponseEntity<Groups> groupupdate(@PathVariable Integer Id, @RequestBody GroupAddModel groupAddModel){
        return groupService.groupupdate(Id,groupAddModel);
    }
}
