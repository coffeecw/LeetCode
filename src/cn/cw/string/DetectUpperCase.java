package cn.cw.string;

/**
 * created by coffeecw 2019/10/14
 * 520. 检测大写字母
 */
public class DetectUpperCase {
    public boolean detectCapitalUse(String word){
        if(word == null || word.length() < 2){//验证第一个字母和合法性检验
            return true;
        }
        if(word.toUpperCase().equals(word)){//大写字母校验
            return true;
        }
        if(word.substring(1).toLowerCase().equals(word.substring(1))){//小写字母校验
            return true;
        }
        return false;
    }

}
