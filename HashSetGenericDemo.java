import java.util.*;

public class HashSetGenericDemo {
    public static void main(String[] args) {
        Set<String> _set = new HashSet<>();

        _set.add("John Snow");
        // _set.add(41);
        _set.add("41");
        _set.add("john@gmail.com");
        _set.add("Product Manager");
        _set.add("813 Howard Street");
        System.out.println(_set);

        System.out.println(_set.add("CA 12345"));
        System.out.println(_set.add("CA 12345"));

        Set<String> anothetSet = new HashSet<>();
        anothetSet.add("Alex White");
        anothetSet.add("42");
        anothetSet.add("Senior Manager");
        anothetSet.add("alex@gmail.com");
        anothetSet.add("159 Howard Street");

        _set.addAll(anothetSet);
        System.out.println(_set);
    }
}
