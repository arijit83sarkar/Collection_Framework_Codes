import java.util.*;

public class HashSetObjectDemo {
    public static void main(String[] args) {
        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(10, "Joshua"));
        bookings.add(new Booking(15, "Victoria"));
        bookings.add(new Booking(19, "Rebecca"));
        bookings.add(new Booking(8, "Amanda"));
        bookings.add(new Booking(20, "Victoria"));
        bookings.add(new Booking(19, "Rebecca"));
        System.out.println("No of Booking List " + bookings.size());

        Set<Booking> setBooking = new HashSet<Booking>(bookings);
        System.out.println("No of Booking Set " + setBooking.size());
        for (Booking booking : setBooking) {
            System.out.println(booking);
            // System.out.println("Booking details " + booking);
        }
    }
}

class Booking {
    int seatNo;
    String name;

    public Booking() {
    }

    public Booking(int seatNo, String name) {
        this.seatNo = seatNo;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + seatNo;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Booking other = (Booking) obj;
        if (seatNo != other.seatNo)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Booking [seatNo=" + seatNo + ", name=" + name + "]";
    }

}
