package order_service_application.order_service.service;

import order_service_application.order_service.client.ProductClient;
import order_service_application.order_service.client.UserClient;
import order_service_application.order_service.dto.OrderRequestDto;
import order_service_application.order_service.dto.OrderResponseDto;
import order_service_application.order_service.dto.ProductDto;
import order_service_application.order_service.dto.UserDto;
import order_service_application.order_service.entity.OrderEntity;
import order_service_application.order_service.repository.OrderRepository;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    @Autowired
    private UserClient userClient;

    @Autowired
    private OrderRepository orderRepository;


    public OrderResponseDto createOrder(OrderRequestDto orderRequestDto){
        ProductDto product = productClient.getProduct(orderRequestDto.getProductId());
//        System.out.println(product.getPrice());

        UserDto user = userClient.getUser(orderRequestDto.getUserId());

        if(product == null || user == null){
            throw new RuntimeException("User/Product not found");
        }

        double totalPrice = product.getPrice() * orderRequestDto.getQuantity();

        OrderEntity orderEntity = OrderEntity.builder()
                .userId(orderRequestDto.getUserId())
                .productId(orderRequestDto.getProductId())
                .quantity(orderRequestDto.getQuantity())
                .build();

        orderRepository.save(orderEntity);

        OrderResponseDto orderResponse = OrderResponseDto.builder()
                .id(orderEntity.getId())
                .userId(orderEntity.getUserId())
                .productId(orderEntity.getProductId())
                .quantity(orderEntity.getQuantity())
                .totalPrice(totalPrice)
                .productName(product.getProductName())
                .price(product.getPrice())
                .userName(user.getName())
                .build();

        return orderResponse;
    }

    public List<OrderEntity> getAllOrders() {
        List<OrderEntity> listOfOrders = orderRepository.findAll();
        return listOfOrders;
    }
}
