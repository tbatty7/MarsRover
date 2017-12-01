import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

    @Test
    public void RoverConstructorCreatesObject() {
        Rover rover = new Rover(1,1,'N');
        assertEquals("1 1 N", rover.getPosition());
    }

    @Test
    public void GetPositionReturnsFormattedStringOfCoords() {
        Rover rover = new Rover(1, 1, 'N');
        assertEquals("1 1 N", rover.getPosition());
    }

    @Test
    public void WhenForwardIsCalledItMovesRoverNorthIfFacingNorth() {
        Rover rover = new Rover(1,1,'N');
        rover.forward();
        assertEquals("1 2 N", rover.getPosition());
    }

    @Test
    public void WhenForwardIsCalledItMovesRoverSouthIfFacingSouth() {
        Rover rover = new Rover(1,1,'S');
        rover.forward();
        assertEquals("1 0 S", rover.getPosition());
    }

    @Test
    public void WhenForwardIsCalledItMovesRoverEastIfFacingEast() {
        Rover rover = new Rover(1,1,'E');
        rover.forward();
        assertEquals("2 1 E", rover.getPosition());
    }

    @Test
    public void WhenForwardIsCalledItMovesRoverWestIfFacingWest() {
        Rover rover = new Rover(1,1,'W');
        rover.forward();
        assertEquals("0 1 W", rover.getPosition());
    }

    //  How do you test a private function?
//    @Test
//    public void WhenTurnRightOrLeftIsCalledWithParameters_NSEW_itTurnsRightWhenFacingNorth() {
//        Rover rover = new Rover(1,1,'N');
//        rover.turnRightOrLeft('N','S','E','W');
//        assertEquals("1 1 W", rover.getPosition());
//    }

    @Test
    public void WhenFacingSouthRoverTurnsRightWhenTurnIsCalledWithR() {
        Rover rover = new Rover(1,1,'S');
        rover.turn('R');
        assertEquals("1 1 W", rover.getPosition());
    }

    @Test
    public void WhenFacingNorthRoverTurnsRightWhenTurnIsCalledWithR() {
        Rover rover = new Rover(1,1,'N');
        rover.turn('R');
        assertEquals("1 1 E", rover.getPosition());
    }
    @Test
    public void WhenFacingEastRoverTurnsRightWhenTurnIsCalledWithR() {
        Rover rover = new Rover(1,1,'E');
        rover.turn('R');
        assertEquals("1 1 S", rover.getPosition());
    }
    @Test
    public void WhenFacingWestRoverTurnsRightWhenTurnIsCalledWithR() {
        Rover rover = new Rover(1,1,'W');
        rover.turn('R');
        assertEquals("1 1 N", rover.getPosition());
    }

    @Test
    public void WhenFacingWestRoverTurnsLeftWhenTurnIsCalledWithL() {
        Rover rover = new Rover(1,1,'W');
        rover.turn('L');
        assertEquals("1 1 S", rover.getPosition());
    }

    @Test
    public void WhenFacingSouthRoverTurnsLeftWhenTurnIsCalledWithL() {
        Rover rover = new Rover(1,1,'S');
        rover.turn('L');
        assertEquals("1 1 E", rover.getPosition());
    }

    @Test
    public void WhenFacingEastRoverTurnsLeftWhenTurnIsCalledWithL() {
        Rover rover = new Rover(1,1,'E');
        rover.turn('L');
        assertEquals("1 1 N", rover.getPosition());
    }

    @Test
    public void WhenFacingNorthRoverTurnsLeftWhenTurnIsCalledWithL() {
        Rover rover = new Rover(1,1,'N');
        rover.turn('L');
        assertEquals("1 1 W", rover.getPosition());
    }

}