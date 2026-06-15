package IBM_questions;
import java.util.*;
public class Coins {
        public static int Add(int x){
            int temp=x;
            int s=0;
            while(temp>0){
                int term=temp%10;
                s+=term;
                temp/=10;
            }
            return s;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++) {
            int a = arr[i];
            int result = Add(a);
            map.put(result, map.getOrDefault(result, 0) + 1);
        }
           for(int key:map.keySet()){
               if(map.get(key)>max){
                   max=map.get(key);
               }
           }

        System.out.println(max);

    }
}
