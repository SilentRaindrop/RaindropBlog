package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SgLinkDao;
import org.model.entity.SgLink;
import org.service.SgLinkService;
import org.springframework.stereotype.Service;

/**
 * 友链(SgLink)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:05
 */
@Service("sgLinkService")
public class SgLinkServiceImpl extends ServiceImpl<SgLinkDao, SgLink> implements SgLinkService {

}

