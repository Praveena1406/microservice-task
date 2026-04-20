package user_service_application.user_service.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user_service_application.user_service.dto.UserDto;
import user_service_application.user_service.entity.UserEntity;
import user_service_application.user_service.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDto userDto) {
        UserEntity userEntity = UserEntity.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .build();
        userRepository.save(userEntity);
    }

    public List<UserEntity> getAllUser() {
        List<UserEntity> usersList = userRepository.findAll();
        return usersList;
    }

    public UserEntity getUser(int id) {
        return userRepository.findById(id)
                .orElseThrow(()->new RuntimeException());
    }
}
