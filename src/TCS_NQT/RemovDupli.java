package TCS_NQT;

import java.util.*;

public class RemovDupli {
    public static void main(String[] args) {
        String s="bcaba";
        HashSet<Character>map=new LinkedHashSet<>();

        for(char i:s.toCharArray()){
            map.add(i);
        }


        StringBuilder m=new StringBuilder();
        for(char a:map){
            m.append(a);
        }
        System.out.println(m.toString());
    }
}
