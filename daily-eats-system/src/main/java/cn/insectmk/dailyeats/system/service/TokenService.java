package cn.insectmk.dailyeats.system.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @Description 令牌服务
 * @Author makun
 * @Date 2024/10/10 9:41
 * @Version 1.0
 */
@Component
public class TokenService {
    // 主题
    @Value("${token.subject}")
    private String subject;
    // 签发者
    @Value("${token.issuer}")
    private String issuer;
    // 令牌自定义标识
    @Value("${token.header}")
    private String header;
    // 令牌秘钥
    @Value("${token.secret}")
    private String secret;
    // 令牌有效期（默认30分钟）
    @Value("${token.expireTime}")
    private int expireTime;

    /**
     * 解析令牌
     * @param token 令牌
     * @return 返回Jws对象
     */
    public Jws<Claims> parseToken(String token) {
        return Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(secret.getBytes()))
                .build()
                .parseSignedClaims(token);
    }

    /**
     * 获取令牌
     * @param claims 需要挂载的信息
     * @return 返回JSON Web Token字符串
     */
    public String getToken(Map<String, Object> claims) {
        String uuid = UUID.randomUUID().toString();

        return Jwts.builder()
                // 设置头部信息header
                .header()
                .add("typ", "JWT")
                .add("alg", "HS256")
                .and()
                // 设置自定义负载信息payload
                .claims(claims)
                // 令牌ID
                .id(uuid)
                // 过期日期
                .expiration(Date.from(Instant.now().plusSeconds(expireTime)))
                // 签发时间
                .issuedAt(new Date())
                // 主题
                .subject(subject)
                // 签发者
                .issuer(issuer)
                // 签名
                .signWith(Keys.hmacShaKeyFor(secret.getBytes()), Jwts.SIG.HS256)
                .compact();
    }
}
