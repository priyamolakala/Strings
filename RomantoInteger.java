package test;
import java.util.*;
public class RomantoInteger {
public int romanToInt(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        char[] c = s.toCharArray();
        int i = 0; int j = 1;
        for(;j<c.length;i++,j++){
            if(map.get(c[i]) >= map.get(c[j])){
               result+=map.get(c[i]); 
            }else{
                result-=map.get(c[i]);
            }
        }
        result+=map.get(c[i]);
        return result;
        
    }

}
