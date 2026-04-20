package product_service_application.product_service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_service_application.product_service.dto.ProductDto;
import product_service_application.product_service.entity.ProductEntity;
import product_service_application.product_service.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(ProductDto productDto) {
        ProductEntity productEntity = ProductEntity.builder()
                .productName(productDto.getProductName())
                .price(productDto.getPrice())
                .stock(productDto.getStock())
                .build();
        productRepository.save(productEntity);
    }

    public List<ProductEntity> getAllProduct() {
        List<ProductEntity> productList = productRepository.findAll();
        return productList;
    }

    public ProductEntity getProduct(int id) {
        return productRepository.findById(id)
                .orElseThrow(()->new RuntimeException());
    }
}
