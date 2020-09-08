package rover;

public class Rover {
  private int posX;
  private int posY;
  private String orientation;

  public Rover(int posY, int posX, String orientation) {
    this.posX = posX;
    this.posY = posY;
    this.orientation = orientation;
  }

  public void receive(String movimientos) {

    for (int i = 0; i < movimientos.length(); i++){
      String movimiento = movimientos.subSequence(i, i+1).toString();
      switch (movimiento) {
      case Movement.LEFT:
        this.computeMovementLeft(movimiento);
        break;
      case Movement.RIGHT:      
        this.computeMovementRight(movimiento);
        break;
      case Movement.FORWARD:
        this.computeMovementForward(movimiento);
        break;
      case Movement.BACKWARD:
        this.computeMovementBackward(movimiento);
        break;      
      default:
    }
    }
    
  }

  
  private void computeMovementBackward(String movimiento) {
  if (orientation == Orientation.NORTH) {
    --this.posY;
    this.orientation = Orientation.SOUTH;
    return;
  }
  if (orientation == Orientation.SOUTH) {
    ++this.posY;
    this.orientation = Orientation.NORTH;
    return;        
  }
  if (orientation == Orientation.WEST) {
    --this.posX;
    this.orientation = Orientation.EAST;
    return;        
  }
  if (orientation == Orientation.EAST) {
    ++this.posX;
    this.orientation = Orientation.WEST;
    return;        
  }
}

  private void computeMovementForward(String movimiento) {
  if (orientation == Orientation.NORTH) {
    ++this.posY;
    return;
  }
  if (orientation == Orientation.SOUTH) {
    --this.posY;
    return;        
  }
  if (orientation == Orientation.WEST) {
    ++this.posY;
    return;        
  }
  if (orientation == Orientation.EAST) {
    --this.posY;
    return;        
  }
}

  private void computeMovementLeft(String movimiento) {
  if (orientation == Orientation.NORTH) {
    --this.posX;
    this.orientation = Orientation.EAST;
    return;
  }
  if (orientation == Orientation.SOUTH) {
    ++this.posX;
    this.orientation = Orientation.WEST;
    return;        
  }
  if (orientation == Orientation.WEST) {
    --this.posY;
    this.orientation = Orientation.NORTH;
    return;        
  }
  if (orientation == Orientation.EAST) {
    ++this.posY;
    this.orientation = Orientation.SOUTH;
    return;        
  }
}

  private void computeMovementRight(String movimiento) {
  if (orientation == Orientation.NORTH) {
    ++this.posX;
    this.orientation = Orientation.WEST;
    return;
  }
  if (orientation == Orientation.SOUTH) {
    --this.posX;
    this.orientation = Orientation.EAST;
    return;        
  }
  if (orientation == Orientation.WEST) {
    ++this.posY;
    this.orientation = Orientation.SOUTH;
    return;        
  }
  if (orientation == Orientation.EAST) {
    --this.posY;
    this.orientation = Orientation.NORTH;
    return;        
  }
  }

  public boolean equals(Rover rover) {
    return ((this.posX == rover.getPosX())&&(this.posY==rover.getPosY())&&(this.orientation==rover.getOrientation()));
  }

  private int getPosX() {
    return this.posX;
  }

  private int getPosY() {
    return this.posY;
  }

  private String getOrientation() {
    return this.orientation;
  }

}
