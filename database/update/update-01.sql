CREATE TABLE IF NOT EXISTS `t_user` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(20) DEFAULT NULL COMMENT '昵称',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `head` varchar(32) DEFAULT NULL COMMENT '头像',
  `birthday` date DEFAULT NULL COMMENT '出生年月日',
  `height` float DEFAULT NULL COMMENT '身高',
  `weight` float DEFAULT NULL COMMENT '体重',
  `gender` char(1) DEFAULT NULL COMMENT '性别',
  `input_date` datetime DEFAULT NULL COMMENT '录入时间',
  `modify_date` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表，储存用户信息';


CREATE TABLE IF NOT EXISTS `t_recipe` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `desc` varchar(200) DEFAULT NULL COMMENT '简介',
  `step` text DEFAULT NULL COMMENT '教程',
  `recipe_type` varchar(200) DEFAULT NULL COMMENT '菜谱类型',
  `num_people` tinyint DEFAULT '1' COMMENT '几人份',
  `calories` int DEFAULT '0' COMMENT '热量',
  `level` tinyint DEFAULT '0' COMMENT '烹饪难度',
  `sort` int DEFAULT '0' COMMENT '排序',
  `is_pub` tinyint(1) DEFAULT '0' COMMENT '是否公开',
  `input_date` datetime DEFAULT NULL COMMENT '录入时间',
  `modify_date` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜谱表，储存菜谱信息';


CREATE TABLE IF NOT EXISTS `t_user_recipe` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `recipe_id` varchar(32) DEFAULT NULL COMMENT '菜谱ID',
  `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
  `sort` int DEFAULT NULL COMMENT '排序',
  `input_date` datetime DEFAULT NULL COMMENT '录入时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户菜谱表，储存用户的菜谱信息';


CREATE TABLE IF NOT EXISTS `t_user_recipe` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `recipe_id` varchar(32) DEFAULT NULL COMMENT '菜谱ID',
  `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
  `sort` int DEFAULT NULL COMMENT '排序',
  `input_date` datetime DEFAULT NULL COMMENT '录入时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户菜谱表，储存用户的菜谱信息';


CREATE TABLE IF NOT EXISTS `t_user_recipe_tag` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `user_id` varchar(32) NOT NULL COMMENT '用户ID',
  `recipe_id` varchar(32) NOT NULL COMMENT '菜谱ID',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户菜谱标签表，储存用户菜谱标签';


CREATE TABLE IF NOT EXISTS `t_food` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `type` varchar(20) DEFAULT NULL COMMENT '分类',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='食材表，储存原料信息';


CREATE TABLE IF NOT EXISTS `t_food_price` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `food_id` varchar(32) DEFAULT NULL COMMENT '食材ID',
  `price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
  `input_date` datetime DEFAULT NULL COMMENT '录入时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='食材价格表，储存价格信息';


CREATE TABLE IF NOT EXISTS `t_recipe_food` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `recipe_id` varchar(32) DEFAULT NULL COMMENT '菜谱ID',
  `food_id` varchar(32) DEFAULT NULL COMMENT '食材ID',
  `amount` float DEFAULT NULL COMMENT '量',
  `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜谱食材表，储存菜谱的食材信息';


CREATE TABLE IF NOT EXISTS `t_recipe_cook_tool` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `type` varchar(20) DEFAULT NULL COMMENT '类型',
  `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜谱烹饪工具表，储存菜谱烹饪工具信息';

