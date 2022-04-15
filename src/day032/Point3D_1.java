package day032;

public class Point3D_1 extends Point {
    private int z;

    public Point3D_1() {
    }

    public Point3D_1 (int x, int y, int z){
    super(x, y);
    this.z=z;



    }






    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
