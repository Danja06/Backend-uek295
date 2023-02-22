package ch.noseryoung.warenkorb.users;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Users {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "firstname")
    String firstname;
    @Column(name = "lastname")
    String lastname;
    public int getId() {
        return id;
    }

    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
}
