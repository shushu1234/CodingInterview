package com.liuyao;

import java.util.Arrays;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,
 * 求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 * 题目保证输入的数组中没有的相同的数字

 数据范围：

 对于%50的数据,size<=10^4

 对于%75的数据,size<=10^5

 对于%100的数据,size<=2*10^5
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={7,5,6,4};
        System.out.println(InversePairs(a));
    }

    public static int InversePairs(int [] array) {
        if (array==null || array.length==0){
            return 0;
        }
//        先复制一份
        int[] copy= Arrays.copyOfRange(array,0,array.length);
        int count=InversePairsCore(array,copy,0,array.length-1);
        return count;
    }

    private static int InversePairsCore(int[] array,int[] copy,int start,int end){
        if (start==end){
            return 0;
        }
        int mid=(start+end)>>1;
//        左边检查
        int left=InversePairsCore(array,copy,start,mid)%1000000007;
//        右边检查
        int right=InversePairsCore(array,copy,mid+1,end)%1000000007;
        int count=0;
        int i=mid;
        int j=end;
        int indexcopy=end;
        while (i>=start && j>mid){
//            当前子数组中前面的比后面的大，
            if (array[i]>array[j]){
                count+=j-mid;
//                将大的那个值复制到复制数组的子数组从后向前的某个位置
                copy[indexcopy--]=array[i--];
//                count值过大取余
                if (count >= 1000000007){
                    count%=1000000007;
                }
            }else {
                copy[indexcopy--]=array[j--];
            }
        }
        for (;i>=start;i--){
            copy[indexcopy--]=array[i];
        }
        for (;j>mid;j--){
            copy[indexcopy--]=array[j];
        }
        for (int k = start; k <=end ; k++) {
            array[k]=copy[k];
        }
        return (left+right+count)%1000000007;
    }
}
