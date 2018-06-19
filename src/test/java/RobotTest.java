import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RobotTest {

        Robot robot;
        Warehouse warehouse;
        int[] coords;

        @Before
        public void setUp() {
            robot = new Robot();
            warehouse = new Warehouse();
            coords  = new int[] {0,0};
        }

    @Test
    public void robot_can_be_placed_at_a_location_in_warehouse() {
        robot.placeRobot(warehouse, coords);
        assertArrayEquals(coords, robot.getLocation());

    }

    @Test
    public void move_robot_command_updates_robot_location(){
        robot.placeRobot(warehouse, coords);
        robot.moveRobot("N");
        int[] expectedCoords = new int[] {1,0};
        assertArrayEquals(expectedCoords, robot.getLocation());
    }

    @Test
    public void robot_can_be_passed_a_series_of_commands(){
        robot.placeRobot(warehouse, coords);
        robot.moveRobot("E N");
        int[] expectedCoords = new int[] {1,1};
        assertArrayEquals(expectedCoords, robot.getLocation());
    }

}