/**
 * Created By liuyao on 2018/4/7 22:45.
 */

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class Main {
    public static void main(String[] args) {
        char[] a={1,0,0};
        System.out.println(isNumeric(a));
    }

    public static boolean isNumeric(char[] str) {
        try {
            Double num=Double.parseDouble(new String(str));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
