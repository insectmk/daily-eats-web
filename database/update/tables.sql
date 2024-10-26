-- 用户表
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
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    CONSTRAINT `pk_t_user_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表，储存用户信息';

-- 菜谱表
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
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    CONSTRAINT `pk_t_recipe_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜谱表，储存菜谱信息';

-- 用户菜谱表
CREATE TABLE IF NOT EXISTS `t_user_recipe` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `user_id` varchar(32) DEFAULT NULL COMMENT '用户ID',
    `recipe_id` varchar(32) DEFAULT NULL COMMENT '菜谱ID',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    `sort` int DEFAULT NULL COMMENT '排序',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    CONSTRAINT `pk_t_user_recipe_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户菜谱表，储存用户的菜谱信息';

-- 用户菜谱标签表
CREATE TABLE IF NOT EXISTS `t_user_recipe_tag` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `user_id` varchar(32) NOT NULL COMMENT '用户ID',
    `recipe_id` varchar(32) NOT NULL COMMENT '菜谱ID',
    `name` varchar(20) DEFAULT NULL COMMENT '名称',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    CONSTRAINT `pk_t_user_recipe_tag_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户菜谱标签表，储存用户菜谱标签';

-- 食材表
CREATE TABLE IF NOT EXISTS `t_food` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `name` varchar(20) DEFAULT NULL COMMENT '名称',
    `type` varchar(20) DEFAULT NULL COMMENT '分类',
    `unit` varchar(10) DEFAULT NULL COMMENT '单位',
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    CONSTRAINT `pk_t_food_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='食材表，储存原料信息';

-- 食材价格表
CREATE TABLE IF NOT EXISTS `t_food_price` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `food_id` varchar(32) DEFAULT NULL COMMENT '食材ID',
    `price` decimal(10,2) DEFAULT NULL COMMENT '单价',
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    CONSTRAINT `pk_t_food_price_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='食材价格表，储存价格信息';

-- 菜谱食材表
CREATE TABLE IF NOT EXISTS `t_recipe_food` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `recipe_id` varchar(32) DEFAULT NULL COMMENT '菜谱ID',
    `food_id` varchar(32) DEFAULT NULL COMMENT '食材ID',
    `amount` float DEFAULT NULL COMMENT '量',
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    CONSTRAINT `pk_t_recipe_food_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜谱食材表，储存菜谱的食材信息';

-- 菜谱烹饪工具表
CREATE TABLE IF NOT EXISTS `t_recipe_cook_tool` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `name` varchar(50) DEFAULT NULL COMMENT '名称',
    `type` varchar(20) DEFAULT NULL COMMENT '类型',
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    CONSTRAINT `pk_t_recipe_cook_tool_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜谱烹饪工具表，储存菜谱烹饪工具信息';

-- 角色表
CREATE TABLE IF NOT EXISTS `t_role` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `name` varchar(50) DEFAULT NULL COMMENT '名称',
    `sort` int default 0 null COMMENT '排序',
    `status` char(1)  null default '1' COMMENT '角色状态（1正常 0停用）',
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志',
    CONSTRAINT `pk_t_role_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色表，用于定义用户角色';

-- 菜单表
CREATE TABLE IF NOT EXISTS `t_menu` (
    `id` varchar(32) NOT NULL COMMENT '主键',
    `name` varchar(50) DEFAULT NULL COMMENT '名称',
    `parent_id` varchar(32) DEFAULT NULL COMMENT '父菜单ID',
    `path` varchar(200) default '' comment '路由地址',
    `status` char(1) default '1' comment '菜单状态（0正常 1停用）',
    `icon` varchar(100) default '#' comment '菜单图标',
    `sort` int default 0 null COMMENT '排序',
    `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
    `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志',
    CONSTRAINT `pk_t_menu_id` PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单表，用于定义角色菜单';

-- 用户角色表
CREATE TABLE IF NOT EXISTS `t_user_role` (
    `user_id`   varchar(32) not null comment '用户ID',
    `role_id`   varchar(32) not null comment '角色ID',
    CONSTRAINT `pk_t_user_role_id` primary key(user_id, role_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户角色表，用于存储用户的角色';

-- 角色菜单表
CREATE TABLE IF NOT EXISTS `t_role_menu` (
    `role_id`   varchar(32) not null comment '角色ID',
    `menu_id`   varchar(32) not null comment '菜单ID',
    CONSTRAINT `pk_t_role_menu_id` primary key(role_id, menu_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色菜单表，用于存储角色的菜单';
