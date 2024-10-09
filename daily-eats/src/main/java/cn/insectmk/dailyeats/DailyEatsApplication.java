package cn.insectmk.dailyeats;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "cn.insectmk.dailyeats.mapper")
@SpringBootApplication
public class DailyEatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyEatsApplication.class, args);
    }

}
