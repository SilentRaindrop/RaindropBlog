package org.service;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: silence
 * @date: 2023年10月03日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SgArticleServiceTest {
    @Resource
    private SgArticleService articleService;
    @Test
    void list() {
        articleService.list();
    }

}