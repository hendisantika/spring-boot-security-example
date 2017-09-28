package com.hendisantika.example.repository;

import com.hendisantika.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/28/17
 * Time: 7:31 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
}
