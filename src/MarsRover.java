import java.util.*;


public class MarsRover {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter top right coordinates of Grid.");
        String gridSize = input.nextLine();
        ArrayList roversArray = new ArrayList( );
        System.out.println("Please enter the rover's starting coordinates and direction.");
        Boolean haveCoordinatesBeenRequested = true;
        int numberOfRovers = 2;
        moveRovers(input, roversArray, haveCoordinatesBeenRequested, numberOfRovers);
        printRoverCoordinates(roversArray);
    }

    private static void moveRovers(Scanner input, ArrayList roversArray, Boolean haveCoordinatesBeenRequested, int numberOfRovers) {
        for (int i = 0; i < numberOfRovers; i++) {
            haveCoordinatesBeenRequested = checkOrRequest(haveCoordinatesBeenRequested);
            int roverX = input.nextInt();
            int roverY = input.nextInt();
            char roverDirection = input.next().charAt(0);
            Rover rover = new Rover(roverX, roverY, roverDirection);
            System.out.println("Please enter the search pattern.");
            String commandString = input.next();
            String[] commandArray = commandString.split("");
            executeSearchPattern(rover, commandArray);
            roversArray.add(rover.getPosition());
        }
    }

    private static void printRoverCoordinates(ArrayList roversArray) {
        for (Object aRoversArray : roversArray) {
            System.out.println(aRoversArray);
        }
    }

    private static Boolean checkOrRequest(Boolean haveCoordinatesBeenRequested) {
        if (haveCoordinatesBeenRequested){
            haveCoordinatesBeenRequested = false;
        } else {
            System.out.println("Please enter the rover's starting coordinates and direction.");
        }
        return haveCoordinatesBeenRequested;
    }

    public static void executeSearchPattern(Rover rover1, String[] commandArray) {
        for (int i = 0; i < commandArray.length; i++) {
            char command = commandArray[i].charAt(0);
            if (command == 'M') {
                rover1.forward();
            } else {
                rover1.turn(command);
            }
        }
    }

}

