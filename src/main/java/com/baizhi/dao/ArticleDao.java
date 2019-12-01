package com.baizhi.dao;

import com.baizhi.entity.Article;

import java.util.List;

public interface ArticleDao {
    public List<Article> selectAll();
}
