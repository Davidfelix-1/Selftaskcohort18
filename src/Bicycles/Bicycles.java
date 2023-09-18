package Bicycles;
public class Bicycles {

    private String name;
    private int gear;
    private int speed;


    public Bicycles(String name, int gear, int speed) {
        this.name = name;

        this.gear = gear;
        if (gear >= 0)
            this.gear = gear++;
        this.speed = speed;
    }

    public Bicycles() {

    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void speed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear ;
    }

    public String getName(){
        return name ;
    }
    public int getSpeed(){
        return speed;
    }
    public int getGear(){
        return gear;
    }


}