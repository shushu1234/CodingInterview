/**
 * Created By liuyao on 2018/3/26 22:41.
 */

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历
 * 的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * 二叉搜索树的左子树都比根节点小，右子树都比根节点大，先从左向右找到比根节点大的，
 * 前面的即为左子树，后面的即为右子树，递归遍历
 */
public class Main {
    public static void main(String[] args) {
        int[] a={5,7,6,11,1,8};
        System.out.println(VerifySquenceOfBST(a));
    }

    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0){
            return false;
        }
        if (sequence.length==1){
            return true;
        }

        return Verify(sequence,0,sequence.length-1);
    }

    public static boolean Verify(int[] se,int start,int end){
        if (start >= end){
            return true;
        }
        int i=start;
       while (se[i]<se[end]){
           i++;
       }
       for (int j=i;j<end;j++){
           if (se[j]<se[end]){
               return false;
           }
       }
       return Verify(se,start,i-1) && Verify(se,i,end-1);
    }
}
