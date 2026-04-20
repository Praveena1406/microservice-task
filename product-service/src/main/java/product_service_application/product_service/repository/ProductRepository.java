package product_service_application.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import product_service_application.product_service.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
