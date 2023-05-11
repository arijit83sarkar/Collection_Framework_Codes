import java.util.*;

public class HashSetDuplicateDemo {
    public static void main(String[] args) {
        // LIST WITH DUPLICATE NAMES
        List<String> nameList = Arrays.asList("Jane", "Amanda", "Joshua", "Megan", "Jane", "Emily", "Scott", "Joshua", "Rebecca", "Daniel", "Victoria", "Megan", "Rebecca");
        System.out.println("Original name list " + nameList + " of size " + nameList.size());
        
        // CREATE A HASHSET OBJECT WITH THE LIST
        Set<String> _set = new HashSet<String>(nameList);
        System.out.println("Unique name list " + _set + " of size " + _set.size());
    }
}
