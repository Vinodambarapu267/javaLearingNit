package test.rectangle;

public class Rectangle {
    private  int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public  int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }


}
