package ch.noseryoung.warenkorb.users;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue
    public UUID id;
    @Column(name = "firstname")
    public String firstname;
    @Column(name = "lastname")
    public String lastname;
    public UUID getId() {
        return id;
    }

    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
}
