import java.util.*;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<String> genericList = new ArrayList<>();

        try {
            genericList.add("Sally Becton");
            genericList.add("Larry Bowen");
            // genericList.add("Elizabeth A. Fabian");
            // genericList.add("Maria Juarez");

            // genericList.add(100.77);
            genericList.add(String.valueOf(123.77));
            System.out.println(genericList);

            System.out.println("Double value : " + Double.parseDouble(genericList.get(2)));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // System.out.println(genericList);
        }
    }
}
