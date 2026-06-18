package ComparableAndComparator;

import java.util.ArrayList;
import java.util.*;
class Students1 {
    int roll;
    String name;

    Students1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
   /* public String toString() {
        return "Roll: " + roll + ", Name: " + name;
    }*/
}public class Students{
    public static void main(String[] args) {
        ArrayList<Students1>list=new ArrayList<Students1>();
        list.add(new Students1(10,"a"));
        list.add(new Students1(5,"b"));
        list.add(new Students1(1,"c"));
        list.add(new Students1(8,"d"));
        Comparator<Students1>com=new Comparator<Students1>() {

            public int compare(Students1 o1, Students1 o2) {
               if(o1.roll>o2.roll){
                   return 1;
               }
               return -1;
            }
        };
       Collections.sort(list,com);
        System.out.println(list);
        for(Students1 s:list){
            System.out.println(s.name+"  "+s.roll);
        }
    }
}
