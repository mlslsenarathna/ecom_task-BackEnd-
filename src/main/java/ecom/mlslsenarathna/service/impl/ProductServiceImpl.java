package ecom.mlslsenarathna.service.impl;

import ecom.mlslsenarathna.model.dto.ProductDTO;
import ecom.mlslsenarathna.model.entity.ProductEntity;
import ecom.mlslsenarathna.repository.ProductRepository;
import ecom.mlslsenarathna.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;
    ModelMapper mapper=new ModelMapper();


    @Override
    public List<ProductDTO> getProductList() {
        List<ProductEntity> list=productRepository.findAll();
        List<ProductDTO> dtoList=new ArrayList<>();

        for (ProductEntity productEntity:list){
            dtoList.add(
                    mapper.map(productEntity,ProductDTO.class)
            );
        }
        return dtoList;
    }

    @Override
    public void updateQuantity(int qty, String productId) {
        Optional<ProductEntity> productEntity=productRepository.findById(productId);
        ProductEntity product=productEntity.orElseThrow();
        product.setQuantity(product.getQuantity()-qty);
        productRepository.save(product);
    }

    @Override
    public void addNewProduct(ProductDTO productDTO) {
        productRepository.save(mapper.map(productDTO,ProductEntity.class));
    }


}
