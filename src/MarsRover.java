//import java.util.Scanner;

import java.util.*;

public class MarsRover {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter top right coordinates of Grid.");
        String gridSize = scanner.nextLine();

        System.out.println("Please enter the rover's starting coordinates and direction.");
          int roverX = scanner.nextInt();
          int roverY = scanner.nextInt();

          char roverDirection = scanner.next().charAt(0);

        Rover rover1 = new Rover(roverX, roverY, roverDirection);

        System.out.println("Please enter the search pattern.");
        String commandString = scanner.next();
        String[] commandArray = commandString.split("");

        executeSearchPattern(rover1, commandArray);

        System.out.println("Please enter the rover's starting coordinates and direction.");
        int roverX2 = scanner.nextInt();
        int roverY2 = scanner.nextInt();
        char roverDirection2 = scanner.next().charAt(0);

        Rover rover2 = new Rover(roverX2, roverY2, roverDirection2);

        System.out.println("Please enter the search pattern.");
        String commandString2 = scanner.next();
        String[] commandArray2 = commandString2.split("");

        executeSearchPattern(rover2, commandArray2);

        System.out.println(rover1.getPosition());
        System.out.println(rover2.getPosition());
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

