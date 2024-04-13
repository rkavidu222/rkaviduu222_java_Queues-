import java.util.LinkedList;
import java.util.Queue;

public class Enqueue {
    public static void main(String[] args) {
        Queue<String> languages=new LinkedList<>();

        languages.add("java");
        languages.add("c");
        languages.add("c++");
        languages.add("python");
        System.out.println("Languages:- "+languages);

        String topElement=languages.peek();
        System.out.println("Top element is :- "+topElement);

        String remove=languages.peek();
        System.out.println("Removed language :-"+remove);
        System.out.println("After removing :- "+languages);

        languages.offer("html");
        System.out.println("after update:-"+languages);
    }
}
