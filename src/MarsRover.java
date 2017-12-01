//import java.util.Scanner;

import java.util.*;

public class MarsRover {
    public static void main(String args[]) {


        System.out.println("Please enter top right coordinates of Grid.");
        Scanner inputLine = new Scanner(System.in);
        String gridSize = inputLine.nextLine();
        //String[] gridSizeArray = gridSize.split(" ");
        //String gridX = gridSizeArray[0];
        //String gridY = gridSizeArray[1];
        //System.out.println(gridX + ", " + gridY);

        System.out.println("Please enter the rover's starting coordinates and direction.");
        Scanner roverStartCoords = new Scanner(System.in);
        String positionString = roverStartCoords.nextLine();
        String[] startCoordsArray = positionString.split(" ");
        int roverX = Integer.parseInt(startCoordsArray[0]);
        int roverY = Integer.parseInt(startCoordsArray[1]);
        char roverDirection = startCoordsArray[2].charAt(0);

        Rover rover1 = new Rover(roverX, roverY, roverDirection);

        System.out.println("Please enter the search pattern.");
        Scanner searchPattern = new Scanner(System.in);
        String commandString = searchPattern.nextLine();
        String[] commandArray = commandString.split("");

        executeSearchPattern(rover1, commandArray);

        System.out.println("Please enter the rover's starting coordinates and direction.");
        Scanner roverStartCoords2 = new Scanner(System.in);
        String positionString2 = roverStartCoords2.nextLine();
        String[] startCoordsArray2 = positionString2.split(" ");
        int roverX2 = Integer.parseInt(startCoordsArray2[0]);
        int roverY2 = Integer.parseInt(startCoordsArray2[1]);
        char roverDirection2 = startCoordsArray2[2].charAt(0);

        Rover rover2 = new Rover(roverX2, roverY2, roverDirection2);

        System.out.println("Please enter the search pattern.");
        Scanner searchPattern2 = new Scanner(System.in);
        String commandString2 = searchPattern2.nextLine();
        String[] commandArray2 = commandString2.split("");

        executeSearchPattern(rover2, commandArray2);

//        ArrayList<String> resultArrayList = new ArrayList<String>();
//        resultArrayList.add(rover1.getPosition());
//
//         System.out.println("Would you like to add another rover? (Y or N)");
//         Scanner response = new Scanner(System.in);
//         String answer = response.nextLine();
//         String[] answerArray = answer.split("");


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

    // public static void(ArrayList responses){
    //    ArrayList<String>
    //    for (int i = 0; i < responses.length; i++){

    //    }

    //  }

}

