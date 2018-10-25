package com.warren.spring.lifecycle;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws Exception{
        File file=new File("C:\\Users\\wuzhe\\Desktop\\0001.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String  line="";
        while ((line=bufferedReader.readLine())!=null){
            char c=line.toCharArray()[0];
            if (c=='1'||c=='3'||c=='5'||c=='7'||c=='9'){
                System.out.println(line);
            }
        }

    }
}
