package daoTest;

import com.gzd.dao.ArticleDao;
import com.gzd.entity.Article;
import com.gzd.service.ArticleDaoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class ArticleDaoTest {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private ArticleDaoService articleDaoService;

    @Test
    public void findAll(){
        List<Article> list = articleDao.findAllArticle();
        System.out.println(list);
    }

    @Test
    public void test(){
        System.out.println("helloworld");
    }

    @Test
    public void findByID(){
        Article article = articleDao.findArticleById(1);
        System.out.println(article);
    }

    @Test
    public void findAlll(){
        List<Article> articles = articleDaoService.showAllArticle();
        System.out.println(articles);
    }

    @Test
    public void tee(){
        int num = articleDao.getTotal();
        System.out.println(num);
    }
}
