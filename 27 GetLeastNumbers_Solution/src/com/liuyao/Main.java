package com.liuyao;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4,。
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution2(a, 4));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (k > input.length || k == 0) {
            return arrayList;
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++) {
            treeMap.put(input[i], 0);
        }
        for (Integer key : treeMap.keySet()
                ) {
            if (k-- > 0) {
                arrayList.add(key);
            } else {
                break;
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution2(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if (k > length || k == 0) {
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        for (Integer inte : maxHeap) {
            result.add(inte);
        }
        return result;
    }
}
