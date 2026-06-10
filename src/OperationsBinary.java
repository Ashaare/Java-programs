import java.util.*;
public class OperationsBinary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //1C0C1C1A0B1
        if(s.length()%2==0||s.length()==0){
            System.out.println("-1");
            return;
        }
        int result=s.charAt(0)-'0';
        for(int i=1;i<s.length();i+=2){
            int value=s.charAt(i+1)-'0';
            char c=s.charAt(i);
            if(c=='C'){
                result=result^value;
            }
            if(c=='A')
            {
                result=result&value;
            }
            if(c=='B'){
                result=result|value;
            }
        }
        System.out.println(result);
    }
}
