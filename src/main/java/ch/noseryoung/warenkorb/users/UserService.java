package ch.noseryoung.warenkorb.users;
import java.util.List;
import java.util.UUID;

public interface UserService {
    User create(User user); //Create User Object
    User findById(UUID id); //Find expected User by Id
    User findByFirstname(String firstname); //Find expected User by Firstname
    User findByLastname(String lastname); //Find expected User by Lastname
    List<User> findAll(); //Find every User existing
}
