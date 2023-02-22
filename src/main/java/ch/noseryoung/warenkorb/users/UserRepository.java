package ch.noseryoung.warenkorb.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository <User, UUID> { //JpaRepository -> Repository for simplified CRUD Methods

    Optional<User>findAllByFirstname(String firstname);
    Optional<User>findAllByLastname(String lastname);
    Optional<User>findAllById(UUID id);
}
