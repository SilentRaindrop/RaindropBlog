package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SgCategoryDao;
import org.model.entity.SgCategory;
import org.service.SgCategoryService;
import org.springframework.stereotype.Service;

/**
 * 分类表(SgCategory)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:05
 */
@Service("sgCategoryService")
public class SgCategoryServiceImpl extends ServiceImpl<SgCategoryDao, SgCategory> implements SgCategoryService {

}

