public class Map {
    int maxWidth;
    int maxHeight;
    public Map(String coordinates){
        String[] CoordinatesArray = coordinates.split(" ");
        this.maxWidth = Integer.parseInt(CoordinatesArray[0]);
        this.maxHeight = Integer.parseInt(CoordinatesArray[1]);
    }

}
