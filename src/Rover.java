import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Rover {
    private int positionX;
    private int positionY;
    private char directionFacing;

    public Rover(int coordinateX, int coordinateY, char direction){
        this.positionX = coordinateX;
        this.positionY = coordinateY;
        this.directionFacing = direction;
    }

    public void forward(){
        if (directionFacing == 'N'){
            this.positionY++;
        } else if (directionFacing == 'S'){
            this.positionY--;
        } else if (directionFacing == 'E'){
            this.positionX++;
        } else if (directionFacing == 'W'){
            this.positionX--;
        }
    }

    private void turnRightOrLeft(char N, char S, char E, char W){
        if (directionFacing == 'N'){
            this.directionFacing = E;
        } else if (directionFacing == 'S'){
            this.directionFacing = W;
        } else if (directionFacing == 'E'){
            this.directionFacing = S;
        } else if (directionFacing == 'W'){
            this.directionFacing = N;
        }
    }

    public void turn(char RightOrLeft){
        if (RightOrLeft == 'R'){
            turnRightOrLeft('N','S','E','W');
        } else if (RightOrLeft == 'L'){
            turnRightOrLeft('S', 'N', 'W', 'E');
        }
    }

    public String getPosition(){
        String coordinateX = Integer.toString(positionX);
        String coordinateY = Integer.toString(positionY);
        String direction = Character.toString(directionFacing);
        String printLine = coordinateX + " " + coordinateY + " " + direction;
        return printLine;
    }
}
