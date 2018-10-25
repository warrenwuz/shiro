package com.warren.spring.lifecycle;

public class WirterFIle {
    public static void main(String[] args) {
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<=9999;i++){
            StringBuilder stringBuilder=new StringBuilder("0000");
            String j=String.valueOf(i);
            result.append(stringBuilder.replace(stringBuilder.length()-j.length(),4,j)+" ");
            if (result.length()==20){
                System.out.println(result.toString());
                result=new StringBuilder("");
            }
        }
    }
}
