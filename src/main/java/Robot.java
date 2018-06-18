public class Robot {

    private Warehouse warehouse;

    public int[] getLocation() {
        return location;
    }

    private int [] location;

    public void placeRobot(Warehouse warehouse, int[] coords) {
        this.warehouse = warehouse;
        location = coords;
        warehouse.setRobotLocation(coords);
    }

    public void moveRobot(String directionCommand) {
        location = updateLocation(directionCommand);
    }

    private int[] updateLocation(String directionCommand) {
        int[] currentLocation = getLocation();
        switch(directionCommand){
            case("N"): currentLocation[0] = currentLocation[0] + 1;
            break;
            case("S"): currentLocation[0] = currentLocation[0] - 1;
            break;
            case("E"): currentLocation[1] = currentLocation[1] + 1;
            break;
            case("W"): currentLocation[1] = currentLocation[1] - 1;
            break;
        }
        return currentLocation;
    }
}

