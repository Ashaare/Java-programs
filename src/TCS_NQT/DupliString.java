package TCS_NQT;
import java.util.*;
public class DupliString {
    public static void main(String[] args) {
        String s="sinstriiintng";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean first=true;
        System.out.print("[");
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                if(!first){
                    System.out.print(",");
                }
                System.out.print(ch+":"+map.get(ch));
                first = false;
            }
        }
        System.out.print("]");
    }
}
