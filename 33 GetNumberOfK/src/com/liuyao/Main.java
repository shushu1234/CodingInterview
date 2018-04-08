package com.liuyao;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int GetNumberOfK(int [] array , int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        if (array.length==0 || k<0){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        if (map.containsKey(k)){
            return map.get(k);
        }
        return -1;
    }
}
