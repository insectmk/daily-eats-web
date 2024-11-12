package cn.insectmk.dailyeats.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 分页信息
 * @Author makun
 * @Date 2024/11/12 13:09
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class PageInfo {
    private Integer currentPage;
    private Integer pageSize;
}
