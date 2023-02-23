package ch.noseryoung.warenkorb.products;

import ch.noseryoung.warenkorb.cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    Optional<Product> findAllByProduct(String product);
    Optional<Product> findALlByBrand(String brand);
    Optional<Product> findAllByPriceBetween(float price, float price2);
    Optional<Product> findAllById(UUID id);
}
