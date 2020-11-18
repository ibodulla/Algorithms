package leatcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ibodulla
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> strMap = new LinkedHashMap<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++){
            if(!strMap.containsKey(charArr[i])){
                strMap.put(charArr[i], i);
            }else{
                strMap.replace(charArr[i], -1);
            }
        }
        if(strMap.size() < 1){
            return -1;
        }
        for(Character k : strMap.keySet()){
            if(strMap.get(k) != -1){
                return strMap.get(k);
            }
        }
        return -1;
    }
}
