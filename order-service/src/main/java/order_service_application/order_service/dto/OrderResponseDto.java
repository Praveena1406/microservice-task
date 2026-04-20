package order_service_application.order_service.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponseDto {

//    private Integer id;
//    private Integer userId;
//    private Integer productId;
//    private Integer quantity;
//    private Double totalPrice;
//    private String status;

    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer quantity;
    private Double totalPrice;

    // Product details
    private String productName;
    private Double price;

    // User details
    private String userName;
}
