package cn.cw.string;

/**
 * created by coffeecw 2019/10/10
 * 344. 反转字符串
 */
public class ReverseString {
    public static void main(String[] args) {

    }
    public void reverseString(char[] s) {
      int i = 0;
      int j = s.length - 1;
      while (i < j){
          char temp = s[j];
          s[j] = s[i];
          s[i] = temp;
          i++;
          j--;
      }
    }
}
