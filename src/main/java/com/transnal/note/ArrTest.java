package com.transnal.note;

/**
 * <P>
 *数组的引用
 * </P>
 * <P>
 * Description： com.transnal.note
 * </P>
 *
 * @author wuzhe1159@163.com
 */
public class ArrTest {

    public static void main(String[] args) {
        int[] arr1={2,4};
        int[] arr2;
        arr2=arr1;
        for (int i=0;i< arr2.length;i++){
            arr2[i]=arr2[i]+1;
        }
        for (int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }



    }

}
