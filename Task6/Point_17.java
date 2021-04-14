package Task6;

public class Point_17 {
    public float x,y;
    public Point_17(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public Point_17(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float results[]=new float[2];
        results[0]=this.x;
        results[1]=this.y;
        return results;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point_17{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
