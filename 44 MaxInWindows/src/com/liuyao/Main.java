package com.liuyao;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 给定一个数组和滑动窗口的大小，
 * 找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}
 * 及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={2,3,4,2,6,2,5,1};
        System.out.println(maxInWindows(a,3));
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if (num==null || size <= 0){
            return res;
        }
//        队列存储每个窗口的最大值下标
        LinkedList<Integer> list=new LinkedList<Integer>();
        for (int i = 0; i < num.length; i++) {
//            如果当前的队列不空，将现在这个值和末尾的值比较，如果比它大，则删除
            while (!list.isEmpty() && num[i]>num[list.peekLast()]){
                list.removeLast();
            }
//            将当前值的下标添加进来
            list.addLast(i);
            if (list.peekFirst()==i-size){
//                如果队列已经达到三个了，则删除队首下标
                list.removeFirst();
            }
//            当当前下标已经大于size-1就应该想结果集添加元素了
            if (i>=size-1){
                res.add(num[list.peekFirst()]);
            }
        }
        return res;
    }
}
