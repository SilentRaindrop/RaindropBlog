package org.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.model.entity.SgCategory;

/**
 * 分类表(SgCategory)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-01 23:39:01
 */
@Mapper
public interface SgCategoryDao extends BaseMapper<SgCategory> {

}

