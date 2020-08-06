package com.missionsky.bbs.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.missionsky.bbs.common.PageResultForBootstrap;
import com.missionsky.bbs.dao.entity.Categorysecond;
import com.missionsky.bbs.dao.entity.Post;
import com.missionsky.bbs.service.ForumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class ForumController {
    @Resource
    private ForumService forumService;

    /**
     *
     * @param model
     * @param cid
     * @return
     */
    @GetMapping("/forum/{cid}")
    public String toIndex(Model model,@PathVariable("cid") Integer cid){
        List<Categorysecond> categorysecondList = forumService.getCategorySecond(cid);
        model.addAttribute("categorysecondList",categorysecondList);
        model.addAttribute("selectedCid",cid);
        return "forum";
    }

    /**
     *
     * @param cid
     * @param csid
     * @param page
     * @param rows
     * @param model
     * @return
     */
    @GetMapping("/getPosts")
    @ResponseBody
    public PageResultForBootstrap<Post> getPosts(Integer cid,Integer csid,Integer page,Integer rows,Model model){

        Page<Post> postPage = new Page<>(page,rows);
        IPage<Post> postIPage = forumService.getPostByCidOrCsid(postPage,cid,csid);
        model.addAttribute("selectedCsid",csid);
        return new PageResultForBootstrap<Post>(postPage.getRecords(), postPage.getTotal());
    }
}
