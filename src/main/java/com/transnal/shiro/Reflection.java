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
public class Reflection {
    private static Logger logger= LoggerFactory.getLogger(Reflection.class);
    public  static Set<String> analyze(Class<?> enumCLass){
        logger.info("------------------------------");
        logger.info("Interfaces:");
        for (Type type:enumCLass.getGenericInterfaces()){
            logger.info("Type",type);
        }
            logger.info("Base",enumCLass.getSuperclass());
            logger.info("Methods:");
            Set<String> methods=new TreeSet<>();
            for (Method m:enumCLass.getMethods()){
                methods.add(m.getName());
            }
            logger.info("methods",methods);
            return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods=analyze(Explore.class);
        Set<String> enumMethods=analyze(Enum.class);

    }
}
