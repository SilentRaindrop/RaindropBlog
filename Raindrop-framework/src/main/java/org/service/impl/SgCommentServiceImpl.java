package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SgCommentDao;
import org.model.entity.SgComment;
import org.service.SgCommentService;
import org.springframework.stereotype.Service;

/**
 * 评论表(SgComment)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:05
 */
@Service("sgCommentService")
public class SgCommentServiceImpl extends ServiceImpl<SgCommentDao, SgComment> implements SgCommentService {

}

