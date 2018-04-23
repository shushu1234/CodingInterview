package com.liuyao;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、
 * for、while、if、else、switch、case
 * 等关键字及条件判断语句（A?B:C）。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Sum_Solution2(100));
    }
    public static int Sum_Solution(int n) {
        if (n==1){
            return 1;
        }else {
            return n+Sum_Solution(n-1);
        }
    }

    public static int Sum_Solution2(int n) {
        return (int) ((Math.pow(n,2)+n)/2);
    }
}
