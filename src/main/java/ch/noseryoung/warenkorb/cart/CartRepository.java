package ch.noseryoung.warenkorb.cart;

import ch.noseryoung.warenkorb.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CartRepository extends JpaRepository<Cart, UUID> {
    Optional<Cart> findAllById(UUID cartId);
    Optional<Cart> findAllByProduct(List<Product> product);

}
