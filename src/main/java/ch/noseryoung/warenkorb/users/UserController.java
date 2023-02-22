package ch.noseryoung.warenkorb.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping("/firstname")
    public ResponseEntity<Users> findByFirstname(@PathVariable("firstname")String firstname){
        return ResponseEntity.ok(userService.findByFirstname(firstname));
    }
    @GetMapping("/lastname")
    public ResponseEntity<Users> findByLastname(@PathVariable("lastname")String lastname){
        return ResponseEntity.ok(userService.findByLastname(lastname));
    }

    @GetMapping("/account")
    public List<Users> findAll(){
        return ResponseEntity.ok(userService.findAll()).getBody();
    }
    @PostMapping({"","/"})
    public ResponseEntity<Users> create(@RequestBody Users users){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(users));
    }

}
