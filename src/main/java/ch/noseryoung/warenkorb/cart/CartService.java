package ch.noseryoung.warenkorb.cart;

import java.util.UUID;

public interface CartService {

    Cart create(Cart cart);
    Cart findByQuantity(int quantity);
    Cart findById(UUID id);
}
