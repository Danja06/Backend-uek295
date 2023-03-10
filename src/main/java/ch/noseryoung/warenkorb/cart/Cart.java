package ch.noseryoung.warenkorb.cart;

import ch.noseryoung.warenkorb.products.Product;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cartId;       //Autogenerated id

    @OneToMany(mappedBy = "cart")
    private List<Product> product;

    @Column(name = "quantity")
    private int quantity;           //amount of certain product.


    public UUID getId() {
        return cartId;
    }


    public void setId(UUID cartId) {
        this.cartId = cartId;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void getQuantity(int quantity) {
        this.quantity = quantity;
    }
}