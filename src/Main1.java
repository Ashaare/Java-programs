import java.util.*;
public class Main1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       // String s="I Love to code in java programming";
        String[] str=s.split(" ");
        int max=0;
        String longest="";
        for(int i=0;i<str.length;i++){
            int count=0;
            for(int j=0;j<str[i].length();j++) {
                count++;
                if (count > max) {
                    max = count;
                    longest = str[i];
                }
            }
        }
        System.out.println(longest);
    }
}
/*
String longest=str[0];
for(int i=1;i<str.length;i++){
if(str[i].length()>longest.length()){
longest=str[i];
}
}
*/
