package com.banyuan;

public class Test01 {
    public static void main(String[] args) {

        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 5, 4, 7, 6, 7, 0, 5};
        int newArr[] = new int[11];
        int j=0;
        int max=0;
        int min=0;
        for (int i = 0; i < 14; i++) {

            if (oldArr[i] != 0) {
                newArr[j] = oldArr[i];
                j++;
            }
        }

        for (  int x = 0; x < 11; x++) {
            System.out.println(newArr[x]);
        }
        System.out.println("======");
        for(int x=0;x<6;x++){
            int temp=0;
            temp=newArr[x];
            newArr[x]=newArr[10-x];
            newArr[10-x]=temp;
        }
        for (  int x = 0; x < 11; x++) {
            System.out.println(newArr[x]);
        }
        System.out.println("======");
        for(int x=0;x<11;x++){

            if(max<newArr[x]){
                max=newArr[x];
            }
        }
        System.out.println(max);

    }

}
