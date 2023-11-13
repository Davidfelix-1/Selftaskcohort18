package NewBegining;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    
    
@Test
public void  testIfTimeIsCorrect(){
    Time time = new Time(  1 , 0, 0);
    assertEquals(1,time.getHour());
    assertEquals(0,time.getMinute());
    assertEquals(0,time.getSeconds());
}

    public static void main() {
        Time time = new Time(0, 0, 0);
        Scanner scanner = new Scanner(System.in);
        try{
            int hour = scanner.nextInt();
            time =new Time(hour,32, 23);
            System.out.println("Hour "+time.getHour());
        }
        catch (Exception joy){
            System.out.println(joy.getMessage());
            main();

        }

    }

}