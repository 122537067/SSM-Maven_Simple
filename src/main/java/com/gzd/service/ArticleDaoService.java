package com.gzd.service;

import com.gzd.entity.Article;

import java.util.List;

public interface ArticleDaoService {
    /**
     * 显示所有文章
     * @return
     */
    List<Article> showAllArticle();
    boolean addArticle(String articleName);
}
