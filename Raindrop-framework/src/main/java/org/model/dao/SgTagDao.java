package org.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.model.entity.SgTag;

/**
 * 标签(SgTag)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-01 23:39:01
 */
@Mapper
public interface SgTagDao extends BaseMapper<SgTag> {

}

