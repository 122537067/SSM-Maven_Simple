package com.gzd.entity;

public class Article {
    int id;
    String articleName;

    public Article(){super();}
    public Article(int id, String articleName) {
        this.id = id;
        this.articleName = articleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleName='" + articleName + '\'' +
                '}';
    }
}
