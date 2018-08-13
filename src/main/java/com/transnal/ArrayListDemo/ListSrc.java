package com.transnal.ArrayListDemo;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.MAXIMUM_CAPACITY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.extern.java.Log;

/**
 * <p>
 * Company： http://www.transnal.com
 * </P>
 * <p>
 *     List 源码分析
 * Description： com.transnal.ArrayListDemo
 * </P>
 *
 * @author wuzhe1159@163.com
 */
@Log
public class ListSrc {
        public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>(1,0.75f);
        map.put("1","2");
        map.forEach((key,value)->{
              log.info(key);
              log.info(value.toString());
         });
          float f=3.5f;
          boolean naN = Float.isNaN(f);

          log.info(naN+"");
        }
  static final int tableSizeFor(int cap) {
    int n = cap - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
  }
}
