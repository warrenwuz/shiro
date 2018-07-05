package com.transnal.shiro;



/**
 * @author wuzhe1159@163.com
 * @ClassName Food
 * @Desciption 实现enum的继承关系
 * @Date 上午 10:00
 * @Version 1.0
 */
public interface Food {
   enum Appetizer implements  Food{
       SALAD,SOUP,SPRING_ROLLS;
   }
   enum MainCourse implements Food{
       LASAGNE,BUPRITO,PAD_THAI,LENTILS,HUMMUS,VINDALOO;
   }
   enum Dessert implements Food{
      TIRAMISU,GELATO,Black_FOREST_CAKE,FRUIT,CREME_cARAMEL;
   }
   enum Coffee implements  Food{
       BLACK_COFFEE,DECAF_COFFEE,ESPRESSO,LATTE,CAPPUCCINO,TEA,HERB_TEA;
   }
}
