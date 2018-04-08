package com.liuyao;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */

/**
 * a^n=a^n/2*a^n/2（n为偶数）
 * a^n=a^(n-1)/2*a(n-1)/2*a  (n为奇数)
 * 注意对base为0和exponent<0的检查
 * 用移位代替除2，用与1代替判断奇数偶数
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Power(2,7));
    }

    public static double Power(double base, int exponent) {
        int srcExponent=exponent;
        if (base == 0){
            return 0;
        }else if (exponent <0){
            exponent = -exponent;
        }
//        如果为负，用一除
        if (srcExponent < 0){
            return 1/getPower(base,exponent);
        }
        return getPower(base,exponent);
    }

    public static double getPower(double base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        if (exponent ==1){
            return base;
        }
//        用移位方式除二操作，7/2=3 3/2=1
        double result=Power(base,exponent>>1);
        result *=result;   //2*2   (2*2*2)^2=2^6
//        指数于1相与，如果为奇数的话，则再乘一次
        if ((exponent & 1) ==1){
            result *= base;  //2*2*2  ((2*2*2)^2)*2=2^7
        }
        return result;
    }
}
