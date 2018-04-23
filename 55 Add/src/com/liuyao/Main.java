package com.liuyao;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Add(1,2));
    }

    public static
    int Add(int num1,int num2) {
        while (num2!=0){
//            先各位相加不进位
            int temp=num1^num2;
//            计算进位值
            num2=(num1 & num2) <<1;
//            相加
            num1=temp;
        }
        return num1;
    }
}
