package ch.noseryoung.warenkorb.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") UUID id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping("/firstname/{firstname}")
    public ResponseEntity<User> findByFirstname(@PathVariable("firstname") String firstname){
        return ResponseEntity.ok(userService.findByFirstname(firstname));
    }
    @GetMapping("/lastname/{lastname}")
    public ResponseEntity<User> findByLastname(@PathVariable("lastname") String lastname){
        return ResponseEntity.ok(userService.findByLastname(lastname));
    }

    @GetMapping
    public List<User> findAll(){
        return ResponseEntity.ok(userService.findAll()).getBody();
    }
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

}
