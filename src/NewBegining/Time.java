package NewBegining;

public class Time {


    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds){
        validate(hour, minute, seconds);
        this.hour=hour;
        this.minute=minute;
        this.seconds=seconds;
    }

    public static void validateHour(int hour){
        boolean hourIsInvalid = hour>23 || hour<0;
        if(hour >23 || hour<0)throw  new IllegalArgumentException("Hour is invalid ");
    }
    public static void validateMinute(int minute){ boolean minuteIsInvalid = minute>59 || minute<0;
        if(minute >59 || minute<0)throw new IllegalArgumentException("Minute is invalid ");
    }
    public static void validateSeconds(int seconds){boolean secondsIsInvalid = seconds>59 || seconds<0;
        if(seconds >59 || seconds<0)throw new  IllegalArgumentException("Seconds is invalid ");
    }

    public Time() {

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setSeconds(int newValue){
        this.seconds=newValue;
    }
}
