package Time;

public class Time {
    private int hour, minute, second;

    //constructor
    public Time(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    //getter method
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    
    //setter method
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
            // System.out.println("error: invalid hour");
            throw new IllegalArgumentException("invalid hour");

        }
    }
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }else {
            this.minute = 0;
            System.out.println("error: invalid minute");        }
    }
    public void setSecond(int second) {
        if (second >=0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("error: invalid second");
        }
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public Time nextTime(){
        ++second;
        if(second == 60){
            second = 0;
            ++minute;
            if(minute == 60){
                minute = 0;
                ++hour;
                if(hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
}
