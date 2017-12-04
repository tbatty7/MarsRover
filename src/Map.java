public class Map {
    int mapWidth;
    int mapHeight;
    public Map(String coordinates){
        String[] CoordinatesArray = coordinates.split(" ");
        this.mapWidth = Integer.parseInt(CoordinatesArray[0]);
        this.mapHeight = Integer.parseInt(CoordinatesArray[1]);
    }

    public void verifyPosition(int x, int y){
        if (x < 0 || x > mapWidth || y < 0 || y > mapHeight){
            System.out.println("Rover is off the grid!");
        }
    }
}
