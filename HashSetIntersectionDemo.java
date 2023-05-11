import java.util.*;

public class HashSetIntersectionDemo {
    public static void main(String[] args) {
        List<String> nameListOne = Arrays.asList("Jane", "Amanda", "Joshua", "Megan");
        List<String> nameListTwo = Arrays.asList("Emily", "Scott", "Rebecca", "Daniel", "Victoria");
        List<String> nameListThree = Arrays.asList("Jane", "Emily", "Joshua", "Rebecca","Victoria", "Amanda");

        // Set<String> _setOne = new HashSet<String>(nameListOne);
        // Set<String> _setTwo = new HashSet<String>(nameListTwo);
        // Set<String> _setThree = new HashSet<String>(nameListThree);

        Set<String> _resultOne = new HashSet<String>(nameListOne);
        _resultOne.retainAll(nameListTwo);
        System.out.println(_resultOne.isEmpty() == true ? "No common element found in the HashSets."
                : "HashSets has common elements.");
        System.out.println("Result has " + _resultOne + " elements of size " + _resultOne.size());
        System.out.println();

        Set<String> _resultTwo = new HashSet<String>(nameListTwo);
        _resultTwo.retainAll(nameListThree);
        System.out.println(_resultTwo.isEmpty() == true ? "No common element found in the HashSets."
                : "HashSets has common elements.");
        System.out.println("Result has " + _resultTwo + " elements of size " + _resultTwo.size());
    }
}
