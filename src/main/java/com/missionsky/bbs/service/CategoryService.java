package com.missionsky.bbs.service;

import com.missionsky.bbs.dao.entity.Category;

import java.util.List;

/**
 * @author Administrator
 */
public interface CategoryService {
    /**
     * @return 获取板块内容
     */
     List<Category> getCategory();
}
