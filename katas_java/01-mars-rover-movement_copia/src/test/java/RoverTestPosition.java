import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rover.Movement;
import rover.Orientation;
import rover.Rover;

public class RoverTestPosition {


 /* @Test
  public void fix_and_rename_me() {
    assertThat(true, is(false));
  }*/

  @Test
  public void rover_move_left() {
    Rover rover = new Rover(3, 5, Orientation.NORTH);
    rover.receive(Movement.LEFT);
    assertTrue(rover.equals(new Rover(3, 4, Orientation.EAST)));
  }
    @Test
  public void rover_move_right() {
    Rover rover = new Rover(3, 5, Orientation.NORTH);
    rover.receive(Movement.RIGHT);
    assertTrue(rover.equals(new Rover(3, 6, Orientation.WEST)));
  }
    @Test
  public void rover_move_forward() {
    Rover rover = new Rover(3, 5, Orientation.NORTH);
    rover.receive(Movement.FORWARD);
    assertTrue(rover.equals(new Rover(4, 5, Orientation.NORTH)));
  }
    @Test
  public void rover_move_backward() {
    Rover rover = new Rover(3, 5, Orientation.NORTH);
    rover.receive(Movement.BACKWARD);
    assertTrue(rover.equals(new Rover(2, 5, Orientation.SOUTH)));
  }
}
