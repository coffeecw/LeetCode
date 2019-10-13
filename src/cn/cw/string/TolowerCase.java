package cn.cw.string;

import java.util.Arrays;

/**
 * created by coffeecw 2019/10/13
 * 709.转换为小写字母
 * A-Z 65-90
 * a-z 97-122
 */
public class TolowerCase {
    public String toLowerCase(String str) {
        if(str==null||str.length()==0){
            return "";
        }
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length;i++){
            if(chars[i]>='A'&&chars[i]<='Z'){
                chars[i]+=32;
            }
        }
        return new String(chars);
    }
}
