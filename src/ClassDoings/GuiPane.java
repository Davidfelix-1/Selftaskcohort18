package ClassDoings;
import javax.swing.*;
public class GuiPane {
    private static Object myName;

    public static void main(String[] args) {
        String myName = JOptionPane.showInputDialog("enter your name:  ");
        JOptionPane.showInputDialog(null,"hello , whats your name ?:  "+ myName);
        String age =JOptionPane.showInputDialog("enter your age: ");
        JOptionPane.showInputDialog(null,"whats your age:  "+age);
    }
}
