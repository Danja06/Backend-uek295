package ch.noseryoung.warenkorb.cart;

import java.util.List;
import java.util.UUID;

public interface CartService {
    Cart create(Cart cart);
    Cart findById(UUID cartId);
    Cart findByProduct(String product);
    List<Cart> findAll();
}
