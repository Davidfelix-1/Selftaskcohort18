package MyCalculations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsCalsTest {


    MathsCals mathsCals = new MathsCals();

@Test

void testForAreaCalculations(){
    mathsCals.findingRadius(35);

}


@Test

void testForCircumference(){
    mathsCals.findingCircumference();
}

}