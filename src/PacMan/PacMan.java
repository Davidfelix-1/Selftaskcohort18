package PacMan;

public class PacMan {

    private String name;
    private boolean isOn;
    private int volume;
    private int tune;

    public PacMan(String name, boolean isOn,int volume,int tune){

    }

    public PacMan() {
    }

    public void isOn(boolean isOn) {
        this.isOn = true;
    }

    public boolean isOn() {
        return false;
    }
    public void increaseVolume(int volume){
    this.volume = volume +1;
    }
    public int getVolume() {
        return volume;
    }


    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public String name(String name){
        return name;
    }

    public void setTune(int tune){
        this.tune=tune+1;
    }

    public int getTune() {
        return tune;
    }
}
