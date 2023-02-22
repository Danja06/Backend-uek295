package ch.noseryoung.warenkorb.products;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;       //Autogenerated id
    @Column(name = "product")
    private String product;         //Name of the Product.
    @Column(name = "brand")
    private String brand;           //Name of the Brand.

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
