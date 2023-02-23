package ch.noseryoung.warenkorb.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {
    private CartService cartService;
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> findById(@PathVariable ("id") UUID cartId){
        return ResponseEntity.ok(cartService.findById(cartId));
    }
    @GetMapping("/product/{product}")
    public ResponseEntity<Cart> findByProduct(@PathVariable ("product")String product){
        return ResponseEntity.ok(cartService.findByProduct(product));
    }
    @GetMapping
    public List<Cart> findAllProducts(){
        return ResponseEntity.ok(cartService.findAll()).getBody();
    }

    @PostMapping
    public ResponseEntity<Cart> create(@RequestBody Cart cart){
        return ResponseEntity.status(HttpStatus.CREATED).body(cartService.create(cart));
    }

}
