package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str="abcXYZdef";
        System.out.println(LeftRotateString(str,3));
    }
    public static String LeftRotateString(String str,int n) {
        if (str==null) return null;
        if (n>str.length())return "";
       return str.substring(n,str.length())+str.substring(0,n);
    }
}
