
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.*;


public class MarsRover {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter top right coordinates of Grid.");
        String gridSize = scanner.nextLine();
        ArrayList roversArray = new ArrayList( );
        System.out.println("Please enter the rover's starting coordinates and direction.");
        Boolean haveCoordinatesBeenRequested = true;
        int numberOfRovers = 2;
        int roverCount = 0;

        while (roverCount < numberOfRovers) {
            haveCoordinatesBeenRequested = getaBoolean(haveCoordinatesBeenRequested);
            int roverX = scanner.nextInt();
            int roverY = scanner.nextInt();

            char roverDirection = scanner.next().charAt(0);

            Rover rover = new Rover(roverX, roverY, roverDirection);

            System.out.println("Please enter the search pattern.");
            String commandString = scanner.next();
            String[] commandArray = commandString.split("");

            executeSearchPattern(rover, commandArray);
            roversArray.add(rover.getPosition());
            roverCount++;
        }

        Iterator roverIterator = roversArray.iterator( );
        while (roverIterator.hasNext()) {
            System.out.println(roverIterator.next());
        }
    }

    private static Boolean getaBoolean(Boolean haveCoordinatesBeenRequested) {
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

