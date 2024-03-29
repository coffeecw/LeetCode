package cn.cw.array;

import java.util.HashSet;
import java.util.Set;

/**
 * created by coffeecw 2019/10/12
 * 3. 无重复字符的最长子串
 */
public class LongerSubString {
    public static void main(String[] args) {
        String s = "aab";

        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
