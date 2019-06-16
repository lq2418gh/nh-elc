package org.jeecg.modules.system.service.impl;

import org.jeecg.modules.system.entity.SysRole;
import org.jeecg.modules.system.mapper.SysRoleMapper;
import org.jeecg.modules.system.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author scott
 * @since 2018-12-19
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public SysRole getRoleByRoleCode(String roleCode) {
        SysRole listSysRole = sysRoleMapper.queryRoleByRoleCode(roleCode);
        return listSysRole;
    }

    @Override
    public SysRole getRoleCodeByUserId(String userid) {
        SysRole sysRole = sysRoleMapper.queryRoleByUserId(userid);
        return sysRole;
    }
}
