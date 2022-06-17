package Date;

public class TestDate {
    public static void main(String[] args) {
        Date D1 = new Date(2022, 1, 22);
        System.out.println(D1);

        D1.setYear(2021);
        System.out.println("Year is " + D1.getYear());

        D1.setMonth(9);
        System.out.println("Month is " + D1.getMonth());

        D1.setDay(27);
        System.out.println("Day is " + D1.getDay());

        D1.setDate(1999, 1, 22);
        System.out.println(D1);

    }
}
