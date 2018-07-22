package com.transnal.shirodemo.service;

import com.transnal.shirodemo.entity.User;

import java.util.Set;

/**
 * <p>
 * Company： http://www.transnal.com
 * </P>
 * <p>
 * Description： com.transnal.shirodemo.service
 * </P>
 *
 * @author wuzhe1159@163.com
 * @date 2018-07-18 18:04
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();
    private PasswordHelper passwordHelper = new PasswordHelper();
    @Override
    public User createUser(User user) {
        //加密密码
        PasswordHelper passwordHelper;
        passwordHelper.encryptPassword(user);
        return userDao.createUser(user);
    }

    @Override
    public void changePassword(Long userId, String newPassword) {

    }

    @Override
    public void correlationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public void uncorrelationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }
}
