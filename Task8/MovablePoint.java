package Task8;

public class MovablePoint implements Movable{
    private int x,y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    @Override
    public void moveUp(){
         x++;
    }
    @Override
    public void moveDown(){
        x--;
    }
    @Override
    public void moveLeft(){
        y++;
    }
    @Override
    public void moveRight(){
        y--;
    }
}
