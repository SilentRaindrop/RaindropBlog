package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SysRoleMenuDao;
import org.model.entity.SysRoleMenu;
import org.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * 角色和菜单关联表(SysRoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:05
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenu> implements SysRoleMenuService {

}

