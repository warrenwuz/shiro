package com.transnal.shirodemo.service;


import com.transnal.shirodemo.entity.Permission;

/**
 * <p>
 * Company： @link http://www.transnal.com
 * </P>
 * <p>
 * Description： com.transnal.shirodemo
 * </P>
 * @author wuzhe1159@163.com
 *
 */
public interface PermissionService {
   public Permission createPermission(Permission permission);
   public void deletePermission(Long permissionId);

}
