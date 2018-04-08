package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={3,4,5,1,2};
        System.out.println(minNumberInRotateArray(a));
    }

    public static int minNumberInRotateArray(int [] array) {
        if (array.length==0){
            return 0;
        }else {
            for (int i=0;i<array.length;i++){
                for (int j=i+1;i<array.length;j++){
                    if (array[i]>array[j]){
                        return array[j];
                    }
                }
            }
        }
        return 0;
    }
}
