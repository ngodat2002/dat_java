package TEST;


public class Point {
    public int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //The public getters and setters

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //Return a 2 element int array containing x and y
    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    //set both x y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * overloading
     *
     * @param x
     * @param y
     * @return
     */
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    //return distance from this instance to the given point at (x,y)
        public double distance(TEST.Point another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff*  yDiff);
    }

    //return the distance from this instance (0,0)
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y* this.y);
    }
}
