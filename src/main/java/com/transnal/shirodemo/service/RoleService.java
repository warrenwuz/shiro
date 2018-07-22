package com.transnal.shirodemo.service;


import com.transnal.shirodemo.entity.Role;

/**
 * <p>
 * Company： http://www.transnal.com
 * </P>
 * <p>
 * Description： com.transnal.shirodemo
 * </P>
 *
 * @author wuzhe1159@163.com
 *  2018-07-18 17:22
 */
public interface RoleService {
    public Role createRole(Role role);
    public void deleteRole(Long roleId);
    //添加角色-权限之间关系
    public void correlationPermissions(Long roleId, Long... permissionIds);
    //移除角色-权限之间关系
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
