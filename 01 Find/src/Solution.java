import java.util.TreeMap;

/**
 * Created By liuyao on 2018/3/15 23:01.
 */
public class Solution {
    public static void main(String[] args) {
//        int[][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] a=new int[1][1];
        a[0][0]=7;
        System.out.println(Find(7,a));
    }
    public static boolean Find(int target, int [][] array) {
        int cow=array.length;
        int col=array[cow-1].length;
        for (int j=0;j<col;j++){
            for (int i=cow-1;i>=0;i--){
                if (array[i][j]<target){
                    break;
                }
                if (array[i][j]== target){
                    return true;
                }
            }
        }
        return false;
    }
}
