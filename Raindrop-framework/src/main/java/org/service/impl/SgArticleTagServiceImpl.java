package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SgArticleTagDao;
import org.model.entity.SgArticleTag;
import org.service.SgArticleTagService;
import org.springframework.stereotype.Service;

/**
 * 文章标签关联表(SgArticleTag)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:02
 */
@Service("sgArticleTagService")
public class SgArticleTagServiceImpl extends ServiceImpl<SgArticleTagDao, SgArticleTag> implements SgArticleTagService {

}

