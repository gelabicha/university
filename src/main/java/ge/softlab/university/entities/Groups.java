package ge.softlab.university.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "public",name = "groups")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groups_seq_generation")
    @SequenceGenerator(name = "groups_seq_generation", sequenceName = "groups_id_seq", allocationSize = 1)
    private Integer Id;


    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "teacher_id")
    private Integer teacherId;
}
