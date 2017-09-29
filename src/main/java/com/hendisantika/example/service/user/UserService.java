package com.hendisantika.example.service.user;

import com.hendisantika.example.domain.User;
import com.hendisantika.example.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/29/17
 * Time: 7:51 AM
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
