package MyCalculations;

public class MathsCals {



    int radius;

    void calculatingArea(int r){
        radius =r;
    }

    void findingRadius(int i){
        double area = 3.14* radius*radius;
        System.out.println("The area for radius is : "+area);
    }


    void findingCircumference(){
        double circle = 2* 3.14* radius;
        System.out.println("the  area of circumference is: "+ circle);
    }
}
