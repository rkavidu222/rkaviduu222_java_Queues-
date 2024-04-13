import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue <Integer> id=new LinkedList<>(); {
            id.offer(129);
            id.offer(159);
            id.offer(100);
            id.offer(105);

            System.out.println("Id queue:- "+id);

            int removeId=id.poll();
            System.out.println("removed student id:- "+removeId);

            System.out.println("after remove :- "+id);
        }
    }
}
