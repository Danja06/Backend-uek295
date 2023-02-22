package ch.noseryoung.warenkorb.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <Users, Integer> { //JpaRepository -> Repository for simplified CRUD Methods

    Optional<Users>findAllByFirstname(String firstname);
    Optional<Users>findAllByLastname(String lastname);
    Optional<Users>findAllById(int id);
}
