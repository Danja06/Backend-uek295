package ch.noseryoung.warenkorb.cart;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CartService {

    Cart create(Cart cart);
    Cart findById(UUID id);
    List<Cart> findAllProducts(String product);
}
