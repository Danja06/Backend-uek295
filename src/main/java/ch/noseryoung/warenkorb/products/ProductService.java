package ch.noseryoung.warenkorb.products;

import java.util.List;


public interface ProductService {
    Product create(Product product);
    Product findById(int productId);
    Product findByProduct(String product);
    Product findByBrand(String brand);
    List<Product> findAll();
}

