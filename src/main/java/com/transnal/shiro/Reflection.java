package com.transnal.shiro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore{
    HERE,THERE
}
/**
 *@ClassName CartoonCharacter
 *@Desciption enum的方法values和value of 都是编译器添加的方法
 *@author   wuzhe1159@163.com
 *@Date     2018年7月1日
 *@Version  1.0
 */
public class Reflection {
    private static Logger logger= LoggerFactory.getLogger(Reflection.class);
    public  static Set<String> analyze(Class<?> enumCLass){
        logger.info("------------------------------");
        logger.info("Interfaces:");
        for (Type type:enumCLass.getGenericInterfaces()){
            logger.info(type.toString());
        }
            logger.info("Base:"+enumCLass.getSuperclass().toString());
            logger.info("Methods:");
            Set<String> methods=new TreeSet<>();
            for (Method m:enumCLass.getMethods()){
                methods.add(m.getName());
            }
            logger.info(methods.toString());
            return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods=analyze(Explore.class);
        Set<String> enumMethods=analyze(Enum.class);
        logger.info("Explore.containAll(Enum)?"+exploreMethods.containsAll(enumMethods));
        logger.info("Explore.removeAll(Enum):");
        exploreMethods.removeAll(enumMethods);
        logger.info(exploreMethods.toString());


    }
}
