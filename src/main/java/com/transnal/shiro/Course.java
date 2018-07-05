package com.transnal.shiro;

import com.transnal.shiro.Food;

/**
 * @author wuzhe1159@163.com
 * @ClassName Course
 * @Desciption TODO
 * @Date 上午 10:02
 * @Version 1.0
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class);
    private Food[] values;
    private Course(Class<? extends Food> kind){
        // FIXME 这是为什么会出现继承接口的存在？
        values=kind.getEnumConstants();
    }

}
