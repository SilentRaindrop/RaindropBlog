package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SgArticleDao;
import org.model.entity.SgArticle;
import org.service.SgArticleService;
import org.springframework.stereotype.Service;

/**
 * 文章表(SgArticle)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:14:50
 */
@Service
public class SgArticleServiceImpl  extends ServiceImpl<SgArticleDao, SgArticle> implements SgArticleService{

}

