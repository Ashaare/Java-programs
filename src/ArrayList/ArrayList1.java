package ArrayList;
import java.util.*;
public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("Three");
        list.add("Vedam");
        list.add("Lovely");
        list.add("Peddi");
        /*for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/
       System.out.println(list.remove(2));
        System.out.println(list.set(1,"Friends"));
        System.out.println(list.contains("Three"));
        System.out.println(list);

    }

}
