package com.missionsky.bbs.service.impl;

import com.missionsky.bbs.dao.entity.Category;
import com.missionsky.bbs.dao.mapper.CategoryMapper;
import com.missionsky.bbs.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author Administrator
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> getCategory() {
        return categoryMapper.getCategory();
    }
}
