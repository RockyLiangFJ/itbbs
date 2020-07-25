package com.missionsky.bbs.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页信息
 *
 * @author
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResultForBootstrap<T> {
    // 你页面需要展示的集合
    private List<T> rows;
    // 总记录数
    private Long total;

}