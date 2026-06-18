package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CC {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(45);
        list.add(97);
        list.add(32);
       // Collections.sort(list);
       // System.out.println(list);
       /* Comparator<Integer> com=new Comparator<Integer>() {

            public int compare(Integer a, Integer b) {
                if(a%10>b%10){
                    return 1;//perform swap
                }
                return -1;//no swap
            }
        };*///it is for custom implementation
        //lamda expression
        Comparator<Integer>com=(a,b)->a%10>b%10?1:-1;
        Collections.sort(list,com);//collections do sort
        System.out.println(list);
    }
}
