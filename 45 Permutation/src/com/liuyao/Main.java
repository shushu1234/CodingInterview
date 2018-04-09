package com.liuyao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Permutation("abc"));
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String > res=new ArrayList<String>();
        if (str.length()==0||str==null){
            return res;
        }
        HashSet<String> set=new HashSet<String>();
        fun(set,str.toCharArray(),0);
        res.addAll(set);
        Collections.sort(res);
        return res;
    }

    public static void fun(HashSet<String> res,char[] str,int k){
        if (k==str.length){
            res.add(new String(str));
            return;
        }
        for (int i = k; i <str.length ; i++) {
            swap(str,i,k);
            fun(res,str,k+1);
            swap(str,i,k);
        }
    }

    public static void swap(char[] str,int i,int k){
        if (i!=k){
            char temp=str[i];
            str[i]=str[k];
            str[k]=temp;
        }
    }
}
