package com.missionsky.bbs.controller;

import com.missionsky.bbs.dao.entity.Category;
import com.missionsky.bbs.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class IndexController {
    @Resource
    private CategoryService categoryService;

    @GetMapping("/index")
    public String toIndex(Model model){
        List<Category> categoryList = categoryService.getCategory();
        model.addAttribute("categoryList",categoryList);
        return "index";
    }
}
