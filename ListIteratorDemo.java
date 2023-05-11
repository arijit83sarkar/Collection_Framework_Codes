import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Tiger");
        linkedList.add("Elephant");
        linkedList.add("Dear");
        linkedList.add("Crocodile");
        linkedList.add("Cat");
        linkedList.add("Shark");
        System.out.println(linkedList);

        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            String string = listIterator.next();

            // REMOVE
            if (string.equals("Elephant")) {
                listIterator.remove();
            }

            // SET/UPDATE
            if (string.equals("Dear")) {
                listIterator.set("Lion");
            }

            // ADDITION/INSERTION
            if (string.equals("Cat")) {
                listIterator.add("Wolf");
            }
        }
        System.out.println(linkedList);
    }
}
