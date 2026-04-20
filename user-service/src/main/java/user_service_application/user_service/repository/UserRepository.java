package user_service_application.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user_service_application.user_service.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
