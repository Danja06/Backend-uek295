package ch.noseryoung.warenkorb.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> findById(@PathVariable("productId") int productId) {
        return ResponseEntity.ok(productService.findById(productId));
    }

    @GetMapping("/product/{product}")
    public ResponseEntity<Product> findByProduct(@PathVariable("product") String product) {
        return ResponseEntity.ok(productService.findByProduct(product));
    }

    @GetMapping("/brand/{brand}")
    public ResponseEntity<Product> findByBrand(@PathVariable("brand") String brand) {
        return ResponseEntity.ok(productService.findByBrand(brand));
    }

    @GetMapping
    public List<Product> findAll() {
        return ResponseEntity.ok(productService.findAll()).getBody();
    }
    @PostMapping
    public ResponseEntity<Product> create (@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(product));
    }

}
