package com.baizhi.controller;

import com.baizhi.entity.Article;
import com.baizhi.service.ArticelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticelService articelService;

    @RequestMapping("findAll")
    public List<Article> findAll() {
        List<Article> articles = articelService.selectAll();
        return articles;
    }
}
