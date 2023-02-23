package ch.noseryoung.warenkorb.cart;

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
    public List<Cart> findAllProducts(String product) {
        return cartRepository.findAllByProduct(product);
    }

    @Override
    public Cart findById(UUID id) {
        Optional<Cart> optionalCart=cartRepository.findById(id);
        if (optionalCart.isPresent()){
            return optionalCart.get();
        }
        throw new NoSuchElementException("The Shopping cart Id "+id+" does not exist");
    }
}
