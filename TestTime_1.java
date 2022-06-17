package Time;

public class TestTime_1 {
    public static void main(String[] args) {
        Time t1 = new Time(1,2,3);
        System.out.println(t1);
        
        // Time t3 = new Time(30,70,80);
        // System.out.println(t3);

        Time t2 = new Time();
        System.out.println(t2);

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        t1.setTime(23,59,59);
        System.out.println("Time is: " + t1);
        System.out.println(t1.nextTime());
        System.out.println(t1.nextTime().nextTime());

        Time t3 = new Time(30,70,80);
        System.out.println(t3);
    }
}

