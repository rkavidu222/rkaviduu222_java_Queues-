import java.util.Deque;
import java.util.LinkedList;

public class DeQueue {
    public static void main(String[] args) {

        Deque<String> car= new LinkedList<>();

        car.add("Benz");
        car.add("BMW");
        car.add("Audi");
        car.add("Ferari");
        System.out.println(car);

        car.removeFirst();
        System.out.println(car);

        car.removeLast();
        System.out.println(car);
    }
}
