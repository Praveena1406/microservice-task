package order_service_application.order_service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Integer id;
    private String name;
    private String email;
}
