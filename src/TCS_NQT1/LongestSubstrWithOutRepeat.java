package TCS_NQT1;
import java.util.*;
public class LongestSubstrWithOutRepeat {
        public static void main(String[] args) {

            String s = "abcacbc";

            StringBuilder str = new StringBuilder();
            int max = 0;

            for (int i = 0; i < s.length(); i++) {

                String m = String.valueOf(s.charAt(i));

                if (str.toString().contains(m)) {

                    max = Math.max(max, str.length());

                    int idx = str.indexOf(m);

                    // Remove characters from beginning up to duplicate character
                    str.delete(0, idx + 1);
                }

                str.append(m);
            }

            max = Math.max(max, str.length());

            System.out.println("Longest Length = " + max);
        }
    }

