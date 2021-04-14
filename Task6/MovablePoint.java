package Task6;

public class MovablePoint extends Point_17{
    private float xStep,yStep;
    public MovablePoint(){
        super();
        this.xStep=0.0f;
        this.yStep=0.0f;
    }
    public MovablePoint(float xStep,float yStep){
        super(xStep,yStep);
        this.xStep=xStep;
        this.yStep=yStep;
    }
    public MovablePoint(float xStep,float yStep,float x,float y) {
        super(x, y);
        this.xStep=xStep;
        this.yStep=yStep;
    }
    public float getXStep() {
        return xStep;
    }

    public void setXStep(float xStep) {
        this.xStep = xStep;
    }

    public float getYStep() {
        return yStep;
    }

    public void setYStep(float yStep) {
        this.yStep = yStep;
    }
    public float[] getXYStep(){
        float[] results=new float[2];
        results[0]=this.xStep;
        results[1]=this.yStep;
        return results;
    }
    public void setXYStep(float xStep,float yStep){
        this.xStep=xStep;
        this.yStep=yStep;
    }

    @Override
    public String toString() {
        return "MovablePoint{"+ super.toString() +
                "xStep=" + xStep +
                ", yStep=" + yStep +
                '}';
    }
    public MovablePoint move(){
        super.x+=xStep;
        super.y+=yStep;
        return this;
    }
}
