package org.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.model.entity.SysUserRole;

/**
 * 用户和角色关联表(SysUserRole)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-01 23:39:01
 */
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRole> {

}

