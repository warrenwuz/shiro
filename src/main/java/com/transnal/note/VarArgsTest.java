package com.transnal.note;

import lombok.extern.slf4j.Slf4j;

/**
 * <P>
 * 可变参数练习
 * </P>
 * <P>
 * Description： 可变参数底层就是传递一个参数数组
 * </P>
 *
 * @author wuzhe1159@163.com

 */
@Slf4j
public class VarArgsTest {
  public static void varArgs(String...args){
      for (String arg:args){
          log.info(arg);
      }
  }

    public static void main(String[] args) {
        varArgs("2","3");
        varArgs(new String[]{"2","4"});
    }
}
