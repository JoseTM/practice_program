import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.Movement;
import rover.Orientation;
import rover.Rover;

public class RoverTestMovement{

  @Test
  public void rover_move_around(){
    Rover rover = new Rover(3,5,Orientation.WEST);
    rover.receive(Movement.LEFT+Movement.LEFT+Movement.LEFT+Movement.LEFT);
    assertEquals(new Rover(3,5,Orientation.WEST), rover); 
  }
  
}