package MrChibuzoClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    Problem myProblem = new Problem();

@Test

 void  testForNameofPersonWithProblems(){
    Problem myProblem = new Problem();
    myProblem.setName("Jingoza");
    assertNotNull("jingoza",myProblem.getName());
}


@Test

 void testForTheListOfAvailableProblems(){
    Problem  myProblem = new Problem();

}


}