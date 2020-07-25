package com.missionsky.bbs.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.missionsky.bbs.common.PageResultForBootstrap;
import com.missionsky.bbs.dao.entity.Category;
import com.missionsky.bbs.dao.entity.Categorysecond;
import com.missionsky.bbs.dao.entity.Post;
import com.missionsky.bbs.dao.mapper.CategorySecondMapper;
import com.missionsky.bbs.dao.mapper.PostMapper;
import com.missionsky.bbs.service.CategoryService;
import com.missionsky.bbs.service.ForumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Controller
public class ForumController {
    @Resource
    private ForumService forumService;
    @Resource
    private PostMapper postMapper;

    @GetMapping("/forum/{csid}")
    public String toIndex(Model model,@PathVariable("csid") Integer csid){
        List<Categorysecond> categorysecondList = forumService.getCategorySecond(csid);
        model.addAttribute("categorysecondList",categorysecondList);
        model.addAttribute("selectedCsid",csid);
        System.out.println("----------------------------------------------------1");
        return "forum";
    }

    @GetMapping("/getPosts")
    @ResponseBody
    public PageResultForBootstrap<Post> getPosts(Integer csid,Integer page,Integer rows){
        System.out.println("----------------------------------------------------");
        Page<Post> postPage = new Page<>(page,rows);

        IPage<Post> postIPage = forumService.getPostByCsid(postPage,csid);

        return new PageResultForBootstrap<Post>(postPage.getRecords(), postPage.getTotal());
    }
}
