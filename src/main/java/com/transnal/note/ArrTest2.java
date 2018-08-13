package com.transnal.note;

import com.transnal.shirodemo.entity.Role;

/**
 * <P>
 * 对象数组的引用
 * </P>
 * <P>
 * Description： com.transnal.note
 * </P>
 *
 * @author wuzhe1159@163.com
 */
public class ArrTest2 {

    public static void main(String[] args) {
        Entity entity = new Entity(new Role[10]);
    }

    static class Entity {

        public Entity(Role[] roles) {
        }
    }
}
