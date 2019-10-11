package cn.cw.string;

/**
 * created by coffeecw 2019/10/10
 */
public class Str {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        int limit = hl-nl;
        if(hl<nl){
            return -1;
        }
        for(int i = 0; i <= limit; i++){
            if(needle.equals(haystack.substring(i,i+needle.length()))){
                return i;
            }
        }
        return -1;
    }
}

