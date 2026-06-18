package TCS_NQT;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str ="123xyz123";


        StringBuilder s1=new StringBuilder();



        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                s1.append(ch[i]);
            }
            else{
                s1.append(" ");

            }

        }
        String l=new String(s1);
        String[] b=l.split(" ");
        int sum=0;
        for(int i=0;i<b.length;i++){
            if(!b[i].isEmpty()){
            sum+=Integer.parseInt(b[i]);
	}

        }
        System.out.println(sum);
    }
}
