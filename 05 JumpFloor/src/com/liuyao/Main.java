package com.liuyao;

public class Main {

    public static void main(String[] args) {
        System.out.println(JumpFloor(3));
    }

    public static int JumpFloor(int target) {
        int[] arr={0,1,2};
        if (target<3){
            return arr[target];
        }
//        利用循环代替递归
        for (int i=3;i<=target;i++){
            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=arr[0]+arr[1];
        }
        return arr[2];
    }
}
