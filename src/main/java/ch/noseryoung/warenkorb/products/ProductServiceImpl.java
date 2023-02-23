package ch.noseryoung.warenkorb.products;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    @Override
    public Product findById(int productId) {
        Optional<Product> optionalProduct=productRepository.findAllById(productId);
        if (optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        throw new NoSuchElementException("no Product with id "+productId+" found");
    }

    @Override
    public Product findByProduct(String product) {
        Optional<Product> optionalProduct=productRepository.findAllByProduct(product);
        if (optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        throw new NoSuchElementException("product "+product+" doesn't exist");
    }

    @Override
    public Product findByBrand(String brand) {
        Optional<Product> optionalProduct=productRepository.findALlByBrand(brand);
        if (optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        throw new NoSuchElementException("brand "+brand+" does not exist");
    }
}
