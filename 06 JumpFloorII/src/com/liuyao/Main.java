package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        System.out.println(JumpFloorII(3));
    }

    public static int JumpFloorII(int target) {
        if (target<0){
            return -1;
        }else if (target==1){
            return 1;
        }else {
            return 2*JumpFloorII(target-1);
        }
    }
}
