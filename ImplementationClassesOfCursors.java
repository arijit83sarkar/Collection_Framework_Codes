import java.util.*;

public class ImplementationClassesOfCursors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);

        Enumeration<Integer> enumeration = vector.elements();
        Iterator<Integer> iterator = vector.iterator();
        ListIterator<Integer> listIterator = vector.listIterator();

        System.out.println(enumeration.getClass().getName());   // java.util.Vector$1
        System.out.println(iterator.getClass().getName());  // java.util.Vector$Itr
        System.out.println(listIterator.getClass().getName());  // java.util.Vector$ListItr
    }
}
