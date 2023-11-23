package HashCodes;

import java.util.Objects;

public class Trooper {

    private String name;
    private int badgerNumber;

    public Trooper(String name, int badgerNumber) {
        this.name = name;
        this.badgerNumber = badgerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadgerNumber() {
        return badgerNumber;
    }

    public void setBadgerNumber(int badgerNumber) {
        this.badgerNumber = badgerNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, badgerNumber);
    }

    @Override
    public boolean equals(Object tp) {
        boolean result = false;

        if (this == tp)
            return true;

        if (tp == null || getClass() != tp.getClass())
            return false;

        // Convert tp to Trooper Object type
        Trooper objectTP = (Trooper) tp;

        if (this.name.equals(objectTP.getName()) && this.badgerNumber == objectTP.getBadgerNumber())
            result = true;

        return result;
    }

    public String toString() {
        return name + " (" + badgerNumber + ")";
    }

    public static void main(String[] args) throws Exception {

        Trooper tp = new Trooper("Mark", 342678);
        Trooper tp1 = new Trooper("Micheal", 3426);
        Trooper tp2 = new Trooper("Micheal", 3426);

        System.out.printf("Trooper: %s\n", tp.toString());
        System.out.printf("Hash Number: %s\n", tp.hashCode());
        System.out.printf("Objects are equal: %s\n", tp.equals(tp1));
        System.out.printf("Objects are equal: %s\n", tp1.equals(tp2));

    }
}