package com.baizhi.service;

import com.baizhi.dao.ArticleDao;
import com.baizhi.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticelServiceImpl implements ArticelService {
    @Autowired
    private ArticleDao articleDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Article> selectAll() {
        List<Article> articles = articleDao.selectAll();
        return articles;
    }
}
