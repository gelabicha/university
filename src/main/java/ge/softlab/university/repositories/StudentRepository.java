package ge.softlab.university.repositories;

import ge.softlab.university.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {
List<Students> findAllByfirstName(String firstName);
}
