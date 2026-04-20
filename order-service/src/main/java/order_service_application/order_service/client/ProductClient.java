package order_service_application.order_service.client;

import order_service_application.order_service.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/products/getproduct/{id}")
    ProductDto getProduct(@PathVariable int id);
}
