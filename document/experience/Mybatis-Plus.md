## 配置

1. [Mybatis-Plus配置逻辑删除](https://baomidou.com/guides/logic-delete/#_top)

2. [Mybatis-Plus日志打印](https://baomidou.com/guides/p6spy/)

## 案例

### 递归查询（树形菜单）

```xml
<resultMap id="VoResultMap" type="cn.insectmk.dailyeats.domain.vo.MenuVo">
    <id column="id" property="id" />
    <result column="name" property="name" />
    <result column="parent_id" property="parentId" />
    <result column="path" property="path" />
    <result column="status" property="status" />
    <result column="icon" property="icon" />
    <!-- 递归查询子菜单 -->
    <collection property="children"
                ofType="cn.insectmk.dailyeats.domain.vo.MenuVo"
                select="selectMenuByParentId"
                column="{parentId=id}"/>
</resultMap>

<!-- 查询用户树形结构菜单 -->
<select id="selectUserMenuTree" resultMap="VoResultMap">
    select id, name, parent_id, path, status, icon
    from t_menu
        left join t_role_menu on t_menu.id = t_role_menu.menu_id
        left join t_user_role on t_user_role.role_id = t_role_menu.role_id
    where t_menu.is_deleted = 0
        and t_user_role.user_id = #{userId}
        and t_menu.parent_id is null
</select>

<!-- 根据父菜单ID查询树形结构菜单 -->
<select id="selectMenuByParentId" resultMap="VoResultMap">
    select id, name, parent_id, path, status, icon
    from t_menu
    where is_deleted = 0
        and parent_id = #{parentId}
</select>
```
