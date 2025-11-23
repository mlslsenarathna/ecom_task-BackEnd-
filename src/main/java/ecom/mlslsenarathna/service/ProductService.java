package ecom.mlslsenarathna.service;

import ecom.mlslsenarathna.model.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService {

    List<ProductDTO> getProductList();


}
