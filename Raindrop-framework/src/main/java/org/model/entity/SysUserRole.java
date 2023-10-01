package org.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 用户和角色关联表(SysUserRole)表实体类
 *
 * @author makejava
 * @since 2023-10-01 23:32:12
 */
@SuppressWarnings("serial")
public class SysUserRole extends Model<SysUserRole> {
    //用户ID
    private Long userId;
    //角色ID
    private Long roleId;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    }

