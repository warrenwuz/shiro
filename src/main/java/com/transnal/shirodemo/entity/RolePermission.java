package com.transnal.shirodemo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Company： http://www.transnal.com
 * </P>
 * <p>
 * Description： com.transnal.shirodemo.entity
 * </P>
 *
 * @author wuzhe1159@163.com
 * @date 2018-07-18 17:44
 */
@Getter
@Setter
@ToString
public class RolePermission implements Serializable {
    private Long roleId;
    private Long permissionId;
}
