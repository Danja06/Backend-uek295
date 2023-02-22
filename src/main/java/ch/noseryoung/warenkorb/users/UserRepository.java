package ch.noseryoung.warenkorb.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository <Users, Integer> { //JpaRepository -> Repository for simplified CRUD Methods

    Optional<Users>findAllByFirstname(String firstname);
    Optional<Users>findAllByLastname(String lastname);
    Optional<Users>findAllById(UUID id);
}
