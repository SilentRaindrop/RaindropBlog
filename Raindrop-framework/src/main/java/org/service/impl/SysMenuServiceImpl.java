package org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.model.dao.SysMenuDao;
import org.model.entity.SysMenu;
import org.service.SysMenuService;
import org.springframework.stereotype.Service;

/**
 * 菜单权限表(SysMenu)表服务实现类
 *
 * @author makejava
 * @since 2023-10-02 09:15:05
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenu> implements SysMenuService {

}

