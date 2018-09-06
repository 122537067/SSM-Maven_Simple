package com.gzd.control;

import com.gzd.service.ArticleDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: $description$
 * @Author: HWX
 * @Date: 2018-09-06
 **/

@Controller
@RequestMapping("")
public class ArticleController {
    @Autowired
    ArticleDaoService articleDaoService;


}
