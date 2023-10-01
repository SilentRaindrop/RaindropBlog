package org.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 角色和菜单关联表(SysRoleMenu)表实体类
 *
 * @author makejava
 * @since 2023-10-01 23:32:12
 */
@SuppressWarnings("serial")
public class SysRoleMenu extends Model<SysRoleMenu> {
    //角色ID
    private Long roleId;
    //菜单ID
    private Long menuId;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    }

