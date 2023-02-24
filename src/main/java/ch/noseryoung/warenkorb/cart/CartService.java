package ch.noseryoung.warenkorb.cart;

import ch.noseryoung.warenkorb.products.Product;

import java.util.List;
import java.util.UUID;

public interface CartService {
    Cart create(Cart cart);
    Cart findById(UUID cartId);
    Cart findByProduct(List<Product> product);
    List<Cart> findAll();
}
