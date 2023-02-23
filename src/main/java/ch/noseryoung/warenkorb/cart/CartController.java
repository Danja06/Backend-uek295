package ch.noseryoung.warenkorb.cart;

import ch.noseryoung.warenkorb.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("cart")
public class CartController {


    private CartService cartService;
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> findById(@PathVariable ("id") UUID id){
        return ResponseEntity.ok(cartService.findById(id));
    }
    @GetMapping("/quantity/{quantity}")
    public ResponseEntity<Cart> findByQuantity(@PathVariable ("quantity") int quantity){
        return ResponseEntity.ok(cartService.findByQuantity(quantity));
    }
    @PostMapping
    public ResponseEntity<Cart> create(@RequestBody Cart cart){
        return ResponseEntity.status(HttpStatus.CREATED).body(cartService.create(cart));
    }

}
