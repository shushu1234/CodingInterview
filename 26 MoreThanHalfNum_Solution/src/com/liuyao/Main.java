package com.liuyao;

import java.util.HashMap;

/**
 *数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array.length ==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (map.get(array[i])==null){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        for (Integer key:map.keySet()){
            if (map.get(key)>array.length/2){
                return key;
            }
        }
        return 0;
    }
}
