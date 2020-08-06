package com.missionsky.bbs.controller;


import com.missionsky.bbs.dao.entity.Post;
import com.missionsky.bbs.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class PostController {
    @Resource
    private PostService postService;

    @GetMapping(value="post/{postId}")
    public String toPost(Model model, @PathVariable("postId") Integer postId){
        Post post = postService.getPostAndUserById(postId);
        System.out.println(post);
        model.addAttribute("post",post);
        return "post";
    }

}
