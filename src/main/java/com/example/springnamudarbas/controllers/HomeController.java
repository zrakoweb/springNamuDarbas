package com.example.springnamudarbas.controllers;

import com.example.springnamudarbas.entities.Post;
import com.example.springnamudarbas.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    private final PostService postService;

    public HomeController(PostService postService) {
        this.postService = postService;
    }


    @RequestMapping("/")
    public String index(Model model) {

        List<Post> latest5Posts = postService.findLatest5();
        model.addAttribute("latest5Posts", latest5Posts);
        List<Post> latest3Posts = latest5Posts.stream().limit(3).collect(Collectors.toList());
        model.addAttribute("latest3Posts", latest3Posts);
        return "index";
    }
}
