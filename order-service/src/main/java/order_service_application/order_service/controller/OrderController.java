package order_service_application.order_service.controller;

import order_service_application.order_service.dto.OrderRequestDto;
import order_service_application.order_service.dto.OrderResponseDto;
import order_service_application.order_service.entity.OrderEntity;
import order_service_application.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/placeorder")
    public OrderResponseDto createOrder(@RequestBody OrderRequestDto orderRequestDto) {
        return orderService.createOrder(orderRequestDto);
    }

    @GetMapping("/getallorders")
    public List<OrderEntity> getAllOrders(){
        return orderService.getAllOrders();
    }
}
