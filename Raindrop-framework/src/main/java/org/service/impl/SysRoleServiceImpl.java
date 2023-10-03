package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SysRoleDao;
import org.model.entity.SysRole;
import org.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色信息表(SysRole)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:05
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRole> implements SysRoleService {

}

