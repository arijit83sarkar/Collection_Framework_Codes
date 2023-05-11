import java.util.*;

public class HashSetUnionDemo {
    public static void main(String[] args) {
        List<String> nameListOne = Arrays.asList("Jane", "Amanda", "Joshua", "Megan");
        List<String> nameListTwo = Arrays.asList("Emily", "Scott", "Rebecca", "Daniel", "Victoria");
        List<String> nameListThree = Arrays.asList("Jane", "Emily", "Joshua", "Rebecca","Victoria", "Amanda");

        Set<String> _resultOne = new HashSet<String>(nameListOne);
        _resultOne.addAll(nameListTwo);
        _resultOne.addAll(nameListThree);
        System.out.println("Result has " + _resultOne + " elements of size " + _resultOne.size());
    }
}
