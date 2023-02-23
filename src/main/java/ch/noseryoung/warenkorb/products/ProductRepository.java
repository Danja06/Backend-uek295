package ch.noseryoung.warenkorb.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findAllByProduct(String product);
    Optional<Product> findALlByBrand(String brand);
    Optional<Product> findAllById(int productId);
    List<Product> findAll();
}
