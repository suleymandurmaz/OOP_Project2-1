package day031;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(-1, -1);//kod tekrarı yapmamak için this()yapılır
        //bir constructur diger constructur ı cagırıyorsa bodının
        //1.parametresi olmalıdır.1. sıradır.*****soru gelecek

/*        this.x=-1;
        this.y=-1;*/
    }


    public Point(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
