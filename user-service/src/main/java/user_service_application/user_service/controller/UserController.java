package user_service_application.user_service.controller;

import jakarta.ws.rs.Path;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user_service_application.user_service.dto.UserDto;
import user_service_application.user_service.entity.UserEntity;
import user_service_application.user_service.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public String addUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
        return "User Created Successfully";
    }

    @GetMapping("/getalluser")
    public List<UserEntity> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getuser/{id}")
    public UserEntity getUser(@PathVariable int id){
        return userService.getUser(id);
    }
}
