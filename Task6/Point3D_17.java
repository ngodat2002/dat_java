package Task6;

public class Point3D_17 extends Point2D_17 {
    private float z;
    public Point3D_17(){
        super();
        this.z=0.0f;
    }
    public Point3D_17(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] results =new float[3];
        results[0]=super.getX();
        results[1]=super.getY();
        results[2]=this.z;
        return results;
    }
    public void setGetXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    @Override
    public String toString() {
        return "Point3D_17{" +super.toString()+
                "z=" + z +
                '}';
    }
}
