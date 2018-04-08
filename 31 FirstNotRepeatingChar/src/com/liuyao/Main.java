package com.liuyao;

import java.util.HashMap;

/**
 * 在一个字符串(1<=字符串长度<=10000，
 * 全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str="avvaafbbdcdsawcfsss";
        System.out.println(FirstNotRepeatingChar(str));
    }

    public static int FirstNotRepeatingChar(String str) {
        if (str==null){
            return -1;
        }
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                int num=map.get(str.charAt(i));
                num++;
                map.put(str.charAt(i),num);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
