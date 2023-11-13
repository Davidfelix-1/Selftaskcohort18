package MyPracticePackage;

public class Car {
    private String make;
    private String model;
    private int year;


    public void start(){
        System.out.println("Engine Started. ");
    }

    public void stop(){
        System.out.println("Engine Stopped. ");
    }

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.start();
        car1.stop();

        car1.setMake();
        car1.setModel();




        }

    private void setModel() {
        this.model= "1923";
        System.out.println(" model " +model);
    }

    private void setMake() {
        this.make= "toyota";
        System.out.println(" make " +make);

    }

}




