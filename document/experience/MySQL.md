## 踩坑

1. 数据库url的问题，SSL要打开才能连接（不明白）：

    ```yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/daily_eats_dev?useSSL=true&serverTimezone=UTC
    ```
