package Queuee;
import java.net.SocketTimeoutException;
import java.util.*;
public class dq {
    public static void main(String[] args) {
        java.util.Deque<Integer>q=new ArrayDeque<>();
        //q.add(9);
        q.addFirst(5);
        q.addFirst(4);
        q.add(9);
        q.addLast(3);
        q.addLast(2);
        q.addLast(1);
        System.out.println(q);
        q.remove(3);//it delete entire reference not only value
        System.out.println(q);
        q.pollFirst(); //to delete 1st element
        System.out.println(q);
        q.pollLast(); //to delete last element
        System.out.println(q);
    }
}
