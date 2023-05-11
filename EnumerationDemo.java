import java.util.*;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i <= 10; i++) {
            vector.addElement(i);
        }
        System.out.println("Original values in Vector ::");
        System.out.println(vector);
        System.out.println();

        Enumeration<Integer> enumeration = vector.elements();
        System.out.println("Even numbers ::");
        while (enumeration.hasMoreElements()) {
            Integer integer = (Integer) enumeration.nextElement();
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }
}