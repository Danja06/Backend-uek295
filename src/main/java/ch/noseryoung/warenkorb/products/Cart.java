package ch.noseryoung.warenkorb.products;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;       //Autogenerated id
    @Column(name = "product")
    private String product;         //Name of the Product.
    @Column(name = "brand")
    private String brand;           //Name of the Brand.

     public UUID getId(){
        return id;
    }
    public String getProduct(){
         return product;
    }
    public String getBrand(){
         return brand;
    }
}
