package ge.softlab.university.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "public",name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_seq_generation")
    @SequenceGenerator(name = "students_seq_generation", sequenceName = "students_id_seq", allocationSize = 1)
    private Integer Id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "per_number")
    private Integer perNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Integer phone;
}
