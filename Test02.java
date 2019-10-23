package com.banyuan;

public class Test02 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,0};
        int k=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(arr[k]);
                k++;

            }
            System.out.println();
        }

    }
}
