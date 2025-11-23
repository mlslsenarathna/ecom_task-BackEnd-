package ecom.mlslsenarathna.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ProductEntity {
    @Id
    private String productId;
    private String productName;
    private String size;
    private int quantity;
    private double price;
}
