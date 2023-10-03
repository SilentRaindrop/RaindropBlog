package org.controller;

import org.model.entity.SgArticle;
import org.service.SgArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: silence
 * @date: 2023年10月02日
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private SgArticleService sgArticleService;
    @GetMapping("/list")
    public List<SgArticle> test(){
        //查询数据库的所有数据
        return sgArticleService.list();
    }
}
