package cn.insectmk.dailyeats;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "cn.insectmk.dailyeats.mapper")
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "每日饭菜", description = "管理自己的每日三餐", version = "1.0.0"))
public class DailyEatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyEatsApplication.class, args);
    }

}
