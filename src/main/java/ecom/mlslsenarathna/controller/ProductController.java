package ecom.mlslsenarathna.controller;

import ecom.mlslsenarathna.model.dto.ProductDTO;
import ecom.mlslsenarathna.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
@CrossOrigin(origins = "http://localhost:5173/")
public class ProductController {

    final ProductService productService;
    @GetMapping("/getAll")
    public List<ProductDTO>  getAllProducts(){
        return productService.getProductList();

    }
    @PostMapping("/setQuantity/{qty}")
    public void setQuantity(@PathVariable int qty,@RequestParam("id") String productId){

        productService.updateQuantity(qty,productId);
    }
    @PostMapping("/addNewProduct")
    public void addProduct(@RequestBody ProductDTO productDTO){
        productService.addNewProduct(productDTO);
    }
//    @PostMapping("{apikey}/setQuantity/{city}")
//    public void setQuantity(@PathVariable int qty,@RequestParam ){
//        // productService.updateQuantity(qty);
//    }

}
