package ch.noseryoung.warenkorb.users;

import java.util.List;

public interface UserService {
    Users create(Users users); //Create User Object
    Users findById(int id); //Find expected User by Id
    Users  findByFirstname(String firstname); //Find expected User by Firstname
    Users  findByLastname(String lastname); //Find expected User by Lastname
    List<Users> findAll(); //Find every User existing

}
