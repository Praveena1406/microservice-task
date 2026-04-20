package product_service_application.product_service.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import product_service_application.product_service.dto.ProductDto;
import product_service_application.product_service.entity.ProductEntity;
import product_service_application.product_service.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public String addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
        return "Product added Successfully";
    }

    @GetMapping("/getallproducts")
    public List<ProductEntity> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/getproduct/{id}")
    public ProductEntity getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
}
