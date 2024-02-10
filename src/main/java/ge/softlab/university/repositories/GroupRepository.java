package ge.softlab.university.repositories;

import ge.softlab.university.entities.Groups;
import ge.softlab.university.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Groups,Integer> {
    List<Groups> findAllById(Integer Id);
}
