package com.transnal.shiro;

/**
 * @author wuzhe1159@163.com
 * @ClassName UpcastEnum
 * @Desciption TODO
 * @Date 下午 19:31
 * @Version 1.0
 */
enum Search
{HITHER,
    YOU}
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] values = Search.values();
        Enum e=Search.HITHER;
        //e.values(); 由于values是编译的时候写入的，所以父类的时候不存在该方法的使用
       for(Enum en:e.getClass().getEnumConstants()){
           System.out.println(en);
       }
    }
}
