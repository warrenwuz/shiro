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
 *  2018-07-18 17:48
 */
@Setter
@Getter
@ToString
public class UserRole implements Serializable {
    private Long userId;
    private Long roleId;

}
