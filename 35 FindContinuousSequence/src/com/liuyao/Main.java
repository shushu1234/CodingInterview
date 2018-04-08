package com.liuyao;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(FindContinuousSequence(100));
    }
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int temp1=1;
        int temp2=2;
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<ArrayList<Integer>>();
        while (temp1 != (1+sum)/2){
            int total=((temp2+temp1)*(temp2-temp1+1))/2;
            if (total < sum){
                temp2++;
            }else if (total > sum){
                temp1++;
            }else {
                ArrayList<Integer> arrayList=new ArrayList<Integer>();
                for (int i = temp1; i <=temp2 ; i++) {
                    arrayList.add(i);
                }
                arrayLists.add(arrayList);
                temp1++;
            }
        }
        return arrayLists;
    }
}
