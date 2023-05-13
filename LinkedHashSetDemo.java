import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("John Snow");
        linkedHashSet.add("Peter Johnson");
        linkedHashSet.add("Madison Hernandez");
        linkedHashSet.add("John Snow");
        linkedHashSet.add("Audrey Davis");
        linkedHashSet.add("Victoria Davis");
        linkedHashSet.add("Isaac Thompson");
        linkedHashSet.add("Chloe Martinez");
        System.out.println("LinkedHashSet has " + linkedHashSet + " elements of size " + linkedHashSet.size());

        linkedHashSet.remove("Audrey Davis");
        System.out.println("\nAfter the removal, LinkedHashSet has " + linkedHashSet + " elements of size " + linkedHashSet.size());

        List<String> nameList = Arrays.asList("Daniel Hall", "Madison Hernandez", "Rebecca Turner", "Isabelle Taylor");
        linkedHashSet.addAll(nameList);
        System.out.println("\nAfter the addition of new collection, LinkedHashSet has " + linkedHashSet + " elements of size " + linkedHashSet.size());
        System.out.println();
    }
}
