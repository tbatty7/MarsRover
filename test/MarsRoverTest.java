import org.junit.Test;

import static org.junit.Assert.*;


public class MarsRoverTest {

    @Test
    public void WhenExecuteSearchPatternIsCalledWith_R_WhenFacingNorthitTurnsRight() {
        Rover rover = new Rover(1,1,'N');
        String positionString = "R";
        String[] startCoordsArray = positionString.split("");
        MarsRover.executeSearchPattern(rover, startCoordsArray);
        assertEquals("1 1 E", rover.getPosition());
    }

    @Test
    public void WhenExecuteSearchPatternIsCalledWith_L_WhenFacingNorthitTurnsLeft() {
        Rover rover = new Rover(1,1,'N');
        String positionString = "L";
        String[] startCoordsArray = positionString.split("");
        MarsRover.executeSearchPattern(rover, startCoordsArray);
        assertEquals("1 1 W", rover.getPosition());
    }

    @Test
    public void WhenExecuteSearchPatternIsCalledWith_RM_WhenFacingNorthItTurnsRightAndMovesForward() {
        Rover rover = new Rover(1,1,'N');
        String positionString = "M";
        String[] startCoordsArray = positionString.split("");
        MarsRover.executeSearchPattern(rover, startCoordsArray);
        assertEquals("1 2 N", rover.getPosition());
    }

    @Test
    public void WhenExecuteSearchPatternIsCalledWith_RM_WhenFacingNorthitTurnsRightAndMovesForward() {
        Rover rover = new Rover(1,1,'N');
        String positionString = "RM";
        String[] startCoordsArray = positionString.split("");
        MarsRover.executeSearchPattern(rover, startCoordsArray);
        assertEquals("2 1 E", rover.getPosition());
    }

    @Test
    public void WhenExecuteSearchPatternIsCalledWith_LMLMLMLMM_itMovesCorrectly() {
        Rover rover = new Rover(1,2,'N');
        String positionString = "LMLMLMLMM";
        String[] startCoordsArray = positionString.split("");
        MarsRover.executeSearchPattern(rover, startCoordsArray);
        assertEquals("1 3 N", rover.getPosition());
    }

    @Test
    public void WhenExecuteSearchPatternIsCalledWith_MMRMMRMRRM_itMovesCorrectly() {
        Rover rover = new Rover(3,3,'E');
        String positionString = "MMRMMRMRRM";
        String[] startCoordsArray = positionString.split("");
        MarsRover.executeSearchPattern(rover, startCoordsArray);
        assertEquals("5 1 E", rover.getPosition());
    }

}

