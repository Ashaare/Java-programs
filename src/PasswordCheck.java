import java.util.*;
public class PasswordCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] s=input.toCharArray();
        int n=0;
        int c=0;
        int space=0;
        for(int i=0;i<s.length;i++){
            char ch=s[0];
            if(Character.isDigit(ch)){
                System.out.println("0");
                return;
            }
            if (s.length < 4) {
                System.out.println(0);
                return;
            }
            char ch1=s[i];


            if(Character.isUpperCase(ch1)){
                c++;
            }
            if(Character.isDigit(ch1))
            {
              n++;
            }
            if(ch1==' ' ||ch1=='/'){
                space++;

            }
        }
        if(n>=1&&c>=1&&space==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
