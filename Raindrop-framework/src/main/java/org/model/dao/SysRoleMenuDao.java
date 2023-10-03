package org.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.model.entity.SysRoleMenu;

/**
 * 角色和菜单关联表(SysRoleMenu)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-01 23:39:01
 */
@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenu> {

}

