package ch.noseryoung.warenkorb.cart;

import ch.noseryoung.warenkorb.products.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService {
    private CartRepository cartRepository;
    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart create(Cart cart) {
        return cartRepository.save(cart);
    }
    @Override
    public Cart findByProduct(List<Product> product) {
        Optional<Cart> optionalCart=cartRepository.findAllByProduct(product);
        if (optionalCart.isPresent()){
            return optionalCart.get();
        }
        throw new NoSuchElementException("product "+product+" was not found in the Shopping cart");
    }
    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart findById(UUID cartId) {
        Optional<Cart> optionalCart=cartRepository.findById(cartId);
        if (optionalCart.isPresent()){
            return optionalCart.get();
        }
        throw new NoSuchElementException("The Shopping cart Id "+cartId+" does not exist");
    }


}
