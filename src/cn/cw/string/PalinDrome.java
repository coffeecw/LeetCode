package cn.cw.string;

/**
 * created by coffeecw 2019/10/09
 * 125 验证回文串
 */
public class PalinDrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        //先转为小写
         s = s.toLowerCase();
         //去掉空格和其他符号
         s = s.replaceAll("[^0-9a-z]","");
         int i = 0;
        int j = s.length() - 1;
         while (i<j){
             if(s.charAt(i)==s.charAt(j)){
                 i++;
                 j--;
             }else{
                 return false;
             }
         }
         return true;
    }
}
