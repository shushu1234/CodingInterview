package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(NumberOf1(16));
    }

    public static int NumberOf1(int n) {
        int count=0;
        String str=Integer.toBinaryString(n);
//        System.out.println(str);
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
