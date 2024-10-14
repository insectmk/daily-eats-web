package cn.insectmk.dailyeats.service;

import cn.insectmk.dailyeats.system.service.TokenService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class TokenServiceTest {
    @Autowired
    private TokenService tokenService;
    Map<String, Object> claims;
    {
        claims = new HashMap<>();
        claims.put("username", "测试用户名");
        claims.put("password", "测试用户密码");
    }

    @Test
    void getToken() {
        System.out.println(tokenService.getToken(claims));
    }

    @Test
    void parseToken() {
        Jws<Claims> claimsJws = tokenService.parseToken(tokenService.getToken(claims));
        System.out.println(claimsJws.getPayload().get("username"));
        System.out.println(claimsJws.getPayload().get("password"));
    }
}
