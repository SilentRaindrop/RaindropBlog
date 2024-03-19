package org.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.model.entity.SgArticle;

/**
 * 文章表(SgArticle)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-01 23:43:04
 */
@Mapper
public interface SgArticleDao extends BaseMapper<SgArticle> {

}

