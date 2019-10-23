package com.banyuan;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        String name = "wangling";
        int cipher = 28364725;
        String name1=null;

       do{
           Scanner s=new Scanner(System.in);
           System.out.print("输入你的名字：");
           name1=s.nextLine();
       }while(!name.equals(name1));
        for(int i=0;i<3;i++){
            Scanner s1=new Scanner(System.in);
            System.out.print("输入你的密码：");
            String cipher1=s1.nextLine();
            if(cipher1.equals(cipher)){
                break;
            }
        }

    }
}
