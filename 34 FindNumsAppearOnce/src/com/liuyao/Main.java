package com.liuyao;

import java.util.HashMap;

/**
 * 一个整型数组里除了两个数字之外，
 * 其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length==0){
            return;
        }
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        int count=1;
        for (Integer i:map.keySet()) {
            if (map.get(i)==1){
                if (count==1){
                    num1[0]=i;
                    count++;
                }
                else num2[0]=i;
            }
        }
    }
}
