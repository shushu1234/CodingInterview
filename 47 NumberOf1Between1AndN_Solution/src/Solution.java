public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().NumberOf1Between1AndN_Solution(13));
    }

    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(i);
        }
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}