import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WarehouseTest {

    @Test
    public void warehouseLocationUpdatedWhenRobotPlaced(){
        Warehouse warehouse = new Warehouse();
        Robot robot = new Robot();
        int[] coords = new int[] {0,0};
        robot.placeRobot(warehouse, coords);

        assertArrayEquals(coords, warehouse.getRobotLocation());
    }

}