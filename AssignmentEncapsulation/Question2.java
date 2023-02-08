package AssignmentEncapsulation;
class Rectangle {
    int length, breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getAreas() {

        return getLength() * getBreadth();
    }


}
public class Question2 {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(2);
        rectangle.setBreadth(46);
        //rectangle.setAreas();
        System.out.println(rectangle.getAreas());
    }
}

// output
// 92
