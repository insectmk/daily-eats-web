package cn.insectmk.dailyeats.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @Description 菜单视图对象
 * @Author makun
 * @Date 2024/10/28 17:26
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVo {
    private String id;
    private String name;
    private String parentId;
    private String path;
    private String status;
    private String icon;
    /** 孩子节点*/
    private List<MenuVo> children;
}
