package com.gzd.dao;

import com.gzd.entity.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> findAllArticle();
    Article findArticleById(int id);
    int getTotal();
}
