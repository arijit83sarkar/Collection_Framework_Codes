import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println("Original values in ArrayList ::");
        System.out.println(arrayList);
        System.out.println();

        Iterator<Integer> iterator = arrayList.iterator();
        System.out.println("Even numbers ::");
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            if (integer % 2 == 0) {
                System.out.println(integer);
            } else {
                iterator.remove();
            }
        }

        System.out.println("Now the values in ArrayList ::");
        System.out.println(arrayList);
    }
}
