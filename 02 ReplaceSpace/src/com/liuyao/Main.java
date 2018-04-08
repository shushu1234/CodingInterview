package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuffer stringBuffer=new StringBuffer("We Are Happy.");
        System.out.println(replaceSpace(stringBuffer));
    }

    public static String replaceSpace(StringBuffer str) {
        StringBuffer sb=new StringBuffer();
        int len=str.length();
        for (int i=0;i<len;i++){
            char c=str.charAt(i);
            if (c==' '){
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return new String(sb);
    }
}
