import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set _set = new HashSet();

        _set.add("John Snow");
        _set.add(41);
        _set.add("john@gmail.com");
        _set.add("Japan");

        System.out.println("Size of the Set object : " + _set.size());

        Object[] objects = _set.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        if (_set.contains(41)) {
            System.out.println("Set contains specified element.");
        }
    }
}