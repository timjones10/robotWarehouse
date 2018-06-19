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
        if (directionCommand.length() > 1){
            stringSplitter(directionCommand);
        }
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
            case(" "):
                break;
        }
        return currentLocation;
    }

    private void stringSplitter(String longDirectionCommand) {
        String[] commandArray = longDirectionCommand.split(("(?!^)"));
        for (int i = 0; i < commandArray.length; i++) {
            moveRobot(commandArray[i]);
        }
    }
}

