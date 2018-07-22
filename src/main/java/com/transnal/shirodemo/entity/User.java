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
 * @date 2018-07-18 17:39
 */
@Getter
@Setter
@ToString
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String salt;
    private Boolean locked = Boolean.FALSE;
    public String getCredentialsSalt() {
        return username + salt;
    }

}
