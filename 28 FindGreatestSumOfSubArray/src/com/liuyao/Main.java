package com.liuyao;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,
 * 题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,
 * 并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
 * 连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = {-2, -8, -1, -5, -9};
        System.out.println(FindGreatestSumOfSubArray2(a));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
//        设置当前值为整数的最小值0x80000000,防止全负数
        int max = Integer.MIN_VALUE;
        int now = 0;
        for (int i = 0; i < array.length; i++) {
//            如果now为负数，直接舍弃，负数只会让结果更小
            if (now <= 0) {
                now = array[i];
            } else {
                now += array[i];
            }
//            更新值
            if (now > max) {
                max = now;
            }
        }
        return max;
    }


    //动态规划
    public static int FindGreatestSumOfSubArray2(int[] array) {
        if (array.length == 0) return 0;
        int sum = array[0], tempsum = array[0]; //注意初始值 不能设为0 防止只有负数
        for (int i = 1; i < array.length; i++) //从1开始 因为0的情况在初始化时完成了
        {
            tempsum = (tempsum < 0) ? array[i] : tempsum + array[i];
            sum = (tempsum > sum) ? tempsum : sum;
        }
        return sum;
    }
}
