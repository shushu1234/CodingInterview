package com.liuyao;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 是的他们的和正好是S，如果有多对数字的和等于S，
 * 输出两个数的乘积最小的。
 *
 *
 * 对应每个测试案例，输出两个数，小的先输出。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={};
        System.out.println(FindNumbersWithSum(a,0));
    }
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int tempi=0;
        int tempj=array.length-1;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        while (tempi<tempj){
            if (array[tempi]+array[tempj]<sum){
                tempi++;
            }else if (array[tempi]+array[tempj]>sum){
                tempj--;
            }else {
                arrayList.add(array[tempi]);
                arrayList.add(array[tempj]);
                return arrayList;
            }
        }
        return arrayList;
    }
}
