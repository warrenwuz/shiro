package com.transnal.shiro;

import com.transnal.shiro.net.mindview.util.Generator;

import java.util.Random;
/**
 *@ClassName CartoonCharacter
 *@Desciption enum由于已经继承了ENUM，所以不能再进行继承其他类，但是多实现
 *@author   wuzhe1159@163.com
 *@Date     2018年7月1日
 *@Version  1.0
 */
public enum CartoonCharacter implements Generator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random random = new Random(47);

    @Override
    public CartoonCharacter next() {
        return values()[random.nextInt((values().length))];//通过随机产生数组小标输出不同的值
    }
    public static <T> void printNext(Generator<T> rg){
        System.out.print(rg.next()+",");
    }
    public static void main(String[] args) {
        CartoonCharacter cc=CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++) {
            printNext(cc);
        }
    }
}
