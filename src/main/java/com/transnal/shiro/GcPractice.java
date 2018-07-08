package com.transnal.shiro;

import java.awt.print.Book;

/**
 * @author wz
 *
 */
public class GcPractice {
        boolean checkedOut=false;
         GcPractice(boolean checkOut){
            checkedOut=checkOut;
        }
        void checkIn(){
            checkedOut=false;
        }

        @Override
        protected void finalize() throws Throwable {
            if (checkedOut){
                System.out.println("Error:check out");
            }
            super.finalize();

        }


    public static void main(String[] args) {
             GcPractice book=new GcPractice(true);
             book.checkIn();
             new GcPractice(true);
             System.gc();//用于强制进行终结动作

    }
}
