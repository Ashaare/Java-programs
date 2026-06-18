package TCS_NQT;
import java.util.*;
public class LongestComPrefix {
    public static void main(String[] args) {
        String[] s={"dog", "docecar", "do"};
        StringBuilder str=new StringBuilder();
        String first=s[0];

        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            boolean match=true;
            for(int j=1;j<s.length;j++){
                if (i >= s[j].length()) {
                    match = false;
                    break;
                }

                char p = s[j].charAt(i);

                if (p != ch) {
                    match = false;
                    break;
                }


            }
            if(match){
                str.append(ch);
            }
            else{
                break;
            }

        }
        System.out.println(str.toString());
    }
}
