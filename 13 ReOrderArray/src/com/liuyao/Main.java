package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={3,2,5,7,4,1,8};
        reOrderArray(a);
    }

    public static void reOrderArray(int [] array) {
//        新建一个数组
        int[] temp=new int[array.length];
        int i=0,j=0;
        int len=0;
//        遍历数组，将奇数先拷贝到temp数组中
        for (i=0,len=0;i<array.length;i++){
            if (array[i]%2!=0){
                temp[len]=array[i];
                len++;
            }
        }
//        将剩下的偶数依次移到原数组的后面
        for (i=j=array.length-1;i>=0;i--){
            if (array[i]%2==0){
                array[j]=array[i];
                j--;
            }
        }
//        将临时数组的数值复制到原数组
        for (i=0;i<len;i++){
            array[i]=temp[i];
        }

    }
}
