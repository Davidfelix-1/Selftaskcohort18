package Nokia;

public class Nokia {
    private String brand;
    private String model;
    private boolean isOn;
    private int batteryLevel;

    public Nokia(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOn = false;
        this.batteryLevel = 100; // Initial battery level at 100%
    }

    // Method to turn the phone on
    public void turnOn() {
        isOn = true;
        System.out.println(brand + " " + model + " is now ON.");
    }

    // Method to turn the phone off
    public void turnOff() {
        isOn = false;
        System.out.println(brand + " " + model + " is now OFF.");
    }

    // Method to check if the phone is on
    public boolean isPhoneOn() {
        return isOn;
    }

    // Method to make a call
    public void makeCall(String phoneNumber) {
        if (isOn) {
            System.out.println("Calling " + phoneNumber + "...");
            decreaseBatteryLevel(5); // Simulate battery consumption during a call
        } else {
            System.out.println("Cannot make a call. The phone is off.");
        }
    }

    // Method to send a text message
    public void sendTextMessage(String recipient, String message) {
        if (isOn) {
            System.out.println("Sending a message to " + recipient + ": " + message);
            decreaseBatteryLevel(2); // Simulate battery consumption for sending messages
        } else {
            System.out.println("Cannot send a message. The phone is off.");
        }
    }

    // Method to check battery level
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Method to decrease battery level
    private void decreaseBatteryLevel(int amount) {
        batteryLevel -= amount;
        if (batteryLevel < 0) {
            batteryLevel = 0;
            System.out.println("Battery is empty. Phone is turning off.");
            turnOff();
        }
    }

    public static void main(String[] args) {
        Nokia myPhone = new Nokia("MyBrand", "MyModel");
        myPhone.turnOn();
        myPhone.makeCall("123-456-7890");
        myPhone.sendTextMessage("John", "Hello there!");
        System.out.println("Battery level: " + myPhone.getBatteryLevel() + "%");
    }
}