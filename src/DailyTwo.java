//import java.util.Scanner;

public class DailyTwo {

 
    int poppy1;
    int poppy2;
    
    
    
    DailyTwo(){
        
        
        poppy1 = 50;
        poppy2 =  20;
    }
    
    
    void showOnConsole(){
        int sum = poppy1 + poppy2;
        System.out.println("sum of inputs:  "+ sum);
    }


    public static void main(String[] args) {

        DailyTwo picazzo = new DailyTwo();
        DailyTwo picazzo1 = new DailyTwo();


        picazzo.showOnConsole();
        picazzo1.showOnConsole();
    }
}
