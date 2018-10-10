package com.transnal.note;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author  wz
 */
public class Label {
    private static Logger logger= LoggerFactory.getLogger(Label.class);
    public static void main(String[] args) {
        int i=0;
        outer://不能有任何语句在这
        for (;true;){
            inner:
            for (;i<10;i++){
                logger.info("i="+i);
                if (i==2){
                    logger.info("continue");
                    continue ;
                }
                if (i==3){
                    logger.info("break");
                    i++;
                    break ;//break只能中断最内部的循环
                }
                if (i==7){
                    logger.info("continue outer");
                    i++;
                    continue outer;
                }
                if (i==8){
                    logger.info("break out");
                    break outer;
                }
                for (int k=0;k<5;k++){
                    logger.info("continue inner");
                    if (k==3){
                        continue inner;
                    }
                }
            }
        }
    }

}
