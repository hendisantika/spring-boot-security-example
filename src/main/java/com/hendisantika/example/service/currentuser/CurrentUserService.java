package com.hendisantika.example.service.currentuser;

import com.hendisantika.example.domain.CurrentUser;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/29/17
 * Time: 7:31 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
