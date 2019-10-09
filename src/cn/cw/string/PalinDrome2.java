package cn.cw.string;

/**
 * created by coffeecw 2019/10/09
 */
public class PalinDrome2 {
    public static void main(String[] args) {

    }
    public static boolean validPalindrome(String s) {
        if(s==null ||s.length()==0){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while (left < right && s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        if(left>=right){
            return true;
        }
        String sub1 = s.substring(left,right);
        String sub2 = s.substring(left+1,right+1);
        return isPalindrome(sub1)||isPalindrome(sub2);
    }
    public static boolean isPalindrome(String s) {
        if(s==null ||s.length()==0){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while (left < right && s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        return left>=right?true:false;
    }
}
