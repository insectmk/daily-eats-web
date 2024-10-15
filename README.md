# 每日饭菜

## 简介

daily-eats-web

## 环境

jdk 17

mysql 8.0

maven 3.8

## 踩坑

1. [swagger3配置](https://blog.csdn.net/m0_51390969/article/details/135735659)

2. 数据库url的问题，SSL要打开才能连接（不明白）：

   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/daily_eats_dev?useSSL=true&serverTimezone=UTC
   ```

3. [Mybatis-Plus配置逻辑删除](https://baomidou.com/guides/logic-delete/#_top)

4. [Mybatis-Plus日志打印](https://baomidou.com/guides/p6spy/)
