package com.liuyao;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(StrToInt("-2147483649"));
    }

    public static int StrToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        if (str.charAt(0) == '+') {
            count = 1;
        } else if (str.charAt(0) == '-') {
            count = -1;
        } else if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            return 0;
        }
        int temp = 0;
        for (int i = Math.abs(count); i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                temp = temp*10+(str.charAt(i) - '0');
            else return 0;
        }
        return count==0?temp:count*temp;
    }
}
