package ecom.mlslsenarathna.model.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {
    private String productId;
    private String productName;
    private String size;
    private int quantity;
    private double price;
}
