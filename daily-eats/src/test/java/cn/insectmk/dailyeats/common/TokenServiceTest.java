package cn.insectmk.dailyeats.common;

import cn.insectmk.dailyeats.domain.dto.LoginUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TokenServiceTest {
    @Autowired
    private TokenService tokenService;

    @Test
    void getToken() {
        LoginUser loginUser = new LoginUser();
        loginUser.setUsername("admin");
        System.out.println(tokenService.getToken(loginUser));
    }

    @Test
    void parseToken() {
        LoginUser loginUser = new LoginUser();
        loginUser.setUsername("admin");
        Jws<Claims> claimsJws = tokenService.parseToken(tokenService.getToken(loginUser));
        System.out.println(claimsJws.getPayload().get("username"));
    }
}
