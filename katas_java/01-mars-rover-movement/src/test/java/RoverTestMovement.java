import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rover.Movement;
import rover.Orientation;
import rover.Rover;

public class RoverTestMovement{

  @Test
  public void moveX(){
    Rover rover = new Rover(0,0,Orientation.WEST);
    rover.receive(Movement.FORWARD);
    assertTrue(new Rover(0,1,Orientation.WEST).equals(rover));
  }

  @Test
  public void moveY(){
    Rover rover = new Rover(0,0,Orientation.WEST);
    rover.receive(Movement.LEFT+Movement.FORWARD);
    assertTrue(new Rover(1,0, Orientation.NORTH).equals(rover));
  }

  @Test
  public void rover_move_around(){
    Rover rover = new Rover(3,5,Orientation.WEST);
    rover.receive(Movement.LEFT+Movement.LEFT+Movement.LEFT+Movement.LEFT);
    assertTrue(new Rover(3,5,Orientation.WEST).equals(rover));
  }

  @Test
  public void rover_world_horizontal_travel(){
    Rover rover = new Rover(0,0,Orientation.WEST);
    rover.receive(Movement.FORWARD+Movement.FORWARD+Movement.FORWARD+Movement.FORWARD+Movement.FORWARD+Movement.FORWARD);
    assertTrue(new Rover(0,0,Orientation.WEST).equals(rover));
  }


  @Test
  public void rover_world_vertical_travel(){
    Rover rover = new Rover(1,3,Orientation.SOUTH);
    rover.receive(Movement.FORWARD+Movement.FORWARD+Movement.FORWARD+Movement.FORWARD+Movement.FORWARD+Movement.FORWARD);
    assertTrue( new Rover(1,3,Orientation.SOUTH).equals(rover));
  }
  
}