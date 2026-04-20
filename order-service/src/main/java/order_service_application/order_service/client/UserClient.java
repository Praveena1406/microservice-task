package order_service_application.order_service.client;

import order_service_application.order_service.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserClient {

    @GetMapping("users/getuser/{id}")
    UserDto getUser(@PathVariable int id);
}
