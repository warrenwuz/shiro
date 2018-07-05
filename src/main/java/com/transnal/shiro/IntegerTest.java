package com.transnal.shiro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基本数据类型的练习
 * @author wz
 */
public class IntegerTest
{
  private  static Logger logger= LoggerFactory.getLogger(IntegerTest.class);
    public static void main(String[] args) {
        //编程二进制的字符串
        int e=8;
        String s = Integer.toBinaryString(e);
        logger.info(s);
        //1000 0111 4+2+1
         logger.info(~e+"");
         int i=10;
         int j=10;
         int z=i^j;
         int x=i&j;
         int y=i|j;
         logger.info("i的二进制为:"+Integer.toBinaryString(i));
         logger.info("j的二进制为:"+Integer.toBinaryString(j));
         //相同则为0，不同则为1
         logger.info("i^j="+z);
         //两个数字都为1则是1，否则是0
        logger.info("i&j=" + x);
          //两个数字只要有一个是1则为1，否则为0
        logger.info("i|j=" + y);
        //将10进制转换为2进制的过程
        logger.info(Integer.parseInt("1000",2)+"");

    }
}
