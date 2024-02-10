package ge.softlab.university.repositories;

import ge.softlab.university.entities.Students;
import ge.softlab.university.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teachers,Integer> {
    List<Teachers> findAllByfirstName(String firstName);
}
