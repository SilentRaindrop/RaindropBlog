package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SgTagDao;
import org.model.entity.SgTag;
import org.service.SgTagService;
import org.springframework.stereotype.Service;

/**
 * 标签(SgTag)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:05
 */
@Service("sgTagService")
public class SgTagServiceImpl extends ServiceImpl<SgTagDao, SgTag> implements SgTagService {

}

