package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.User;
import cn.insectmk.dailyeats.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    void getUser() {
        List<User> list = userService.list();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    void addUser() {
        User user = new User();
        user.setUsername("test");
        userService.save(user);
    }

    @Test
    void deleteUser() {
        userService.removeById("75008cacaca03854f289026824b45479");
    }
}
