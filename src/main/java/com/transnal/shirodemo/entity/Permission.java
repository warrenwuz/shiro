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
 *  2018-07-18 17:32
 */

@Getter
@Setter
@ToString
public class Permission implements Serializable {
    private Long id;
    private String permission; //权限标识 程序中判断使用,如"user:create"
    private String description; //权限描述,UI界面显示使用
    private Boolean available = Boolean.FALSE; //是否可用,如果不可用将不会添加给用户
}
