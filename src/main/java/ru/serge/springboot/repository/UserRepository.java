package ru.serge.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.serge.springboot.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}
