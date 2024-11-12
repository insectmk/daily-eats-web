package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.User;
import cn.insectmk.dailyeats.service.IUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    void getUserPage() {
        IPage<User> page = new Page<>(1, 10);
        userService.page(page);
        System.out.println(page.getRecords());
    }

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
