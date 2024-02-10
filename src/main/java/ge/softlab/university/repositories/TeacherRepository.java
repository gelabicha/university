package ge.softlab.university.repositories;

import ge.softlab.university.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teachers,Integer> {

}
