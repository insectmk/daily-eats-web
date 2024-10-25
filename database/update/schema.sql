DROP PROCEDURE IF EXISTS schema_update; -- 删除已经存在的同名存储过程
CREATE PROCEDURE schema_update() BEGIN
-- ************开始**************

-- 为表添加 is_deleted 字段
IF not EXISTS (SELECT 1 FROM information_schema.columns WHERE table_name = 't_user' and column_name = 'is_deleted') THEN
  ALTER TABLE `t_user` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
  ALTER TABLE `t_recipe` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
  ALTER TABLE `t_user_recipe` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
  ALTER TABLE `t_user_recipe_tag` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
  ALTER TABLE `t_food` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
  ALTER TABLE `t_food_price` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
  ALTER TABLE `t_recipe_food` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
  ALTER TABLE `t_recipe_cook_tool` ADD COLUMN `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志';
END IF;

-- 用户表 修改字段 头像
IF EXISTS (SELECT 1 FROM information_schema.columns WHERE table_name = 't_user' and column_name = 'head' and character_maximum_length = 20) THEN
  ALTER TABLE `t_user` MODIFY COLUMN `head` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像';
END IF;

-- 用户表 用户名 唯一索引
IF NOT EXISTS (SELECT * FROM information_schema.statistics WHERE table_name = 't_user' AND index_name = 'uni_user_username') THEN  
   alter table `t_user` add unique index `uni_user_username` (`username`);
END IF;

-- ************结束**************
END;
call schema_update();-- 运行该存储过程
drop PROCEDURE schema_update; -- 删除该存储过程
