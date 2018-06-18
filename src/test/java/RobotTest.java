import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RobotTest {

        Robot robot;
        Warehouse warehouse;

    @Test
    public void robot_can_be_placed_at_a_location_in_warehouse() {
        robot = new Robot();
        warehouse = new Warehouse();
        int[] coords = new int[] {0,0};
        robot.placeRobot(warehouse, coords);

        assertArrayEquals(coords, robot.getLocation());

    }

    @Test
    public void move_robot_command_updates_robot_location(){
        robot = new Robot();
        warehouse = new Warehouse();
        int[] coords = new int[] {0,0};
        robot.placeRobot(warehouse, coords);
        robot.moveRobot("N");
        int[] newCoords = new int[] {1,0};
        assertArrayEquals(newCoords, robot.getLocation());
    }

    @Test
    public void robot_can_be_passed_a_series_of_commands(){
        robot = new Robot();
        warehouse = new Warehouse();
        int[] coords = new int[] {0,0};
        robot.placeRobot(warehouse, coords);
        robot.moveRobot("N E N");
    }

}