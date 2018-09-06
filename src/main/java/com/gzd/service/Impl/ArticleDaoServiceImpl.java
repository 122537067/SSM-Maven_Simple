package com.gzd.service.Impl;

import com.gzd.dao.ArticleDao;
import com.gzd.entity.Article;
import com.gzd.service.ArticleDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleDaoServiceImpl implements ArticleDaoService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public List<Article> showAllArticle() {
        List<Article> list = articleDao.findAllArticle();
        return list;
    }

    @Override
    public boolean addArticle(String articleName) {
        int i = articleDao.addArticle(articleName);
        if(i>0) return true;
        return false;
    }
}
