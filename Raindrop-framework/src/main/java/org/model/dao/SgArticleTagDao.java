package org.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.model.entity.SgArticleTag;

/**
 * 文章标签关联表(SgArticleTag)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-01 23:38:59
 */
@Mapper
public interface SgArticleTagDao extends BaseMapper<SgArticleTag> {

}

