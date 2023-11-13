import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatingClassTest {

@Test
    public void testIfProjectHasName(){
    CreatingClass creatingClass = new CreatingClass();
    creatingClass.setMake(null);
    assertNotNull("toyota",creatingClass.getMake());

}

}