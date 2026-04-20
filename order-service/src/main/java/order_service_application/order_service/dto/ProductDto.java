package order_service_application.order_service.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {

    private Integer id;
    private String productName;
    private Double price;
    private Integer stock;
}
