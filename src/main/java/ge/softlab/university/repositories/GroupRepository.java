package ge.softlab.university.repositories;

import ge.softlab.university.entities.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Groups,Integer> {

}
