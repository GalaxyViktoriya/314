package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
@Repository
@EnableJpaRepositories
public interface UserDao extends JpaRepository<User, Long> {

    User getUserByLogin(String login);

    User getUserById(long id);
}
