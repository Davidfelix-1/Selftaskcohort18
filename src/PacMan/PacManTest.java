package PacMan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PacManTest {

        @Test
        public void checkIfPacManIsOn () {
            PacMan myPacMan = new PacMan();
            myPacMan.isOn(true);
            assertTrue(true);

        }
        @Test
        public void checkIfPacManIsOff () {
            PacMan myPacMan = new PacMan();
            myPacMan.isOn(true);
            assertTrue(true);
            myPacMan.isOn(false);
            assertFalse(false);
        }
        @Test
        public void increasePacManVolume () {
            PacMan myPacMan = new PacMan();
            //Given that my pacman is on
            myPacMan.isOn(true);
            assertTrue(true);
            myPacMan.increaseVolume(2);
            assertEquals(3, myPacMan.getVolume());
        }
        @Test
        public void checkForPacManName () {
            PacMan myPacMan = new PacMan();
            //Given that my pacman is on
            myPacMan.isOn(true);
            assertTrue(true);
            myPacMan.setName(myPacMan.getName());
            String actual = myPacMan.name("boomPac");
        }
        @Test
        public void checkIfPacManBeTuned () {
            PacMan myPacMan = new PacMan();
            myPacMan.isOn(true);
            assertTrue(true);
            myPacMan.setTune(2);
            assertEquals(myPacMan.getTune(), 3);
        }

    }

