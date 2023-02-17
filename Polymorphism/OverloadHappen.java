package Polymorphism;
class Shapes{
    public void calculateArea(int side){
        System.out.println("area of square is "+ side*side);
    }
//    public double area(int radius){
//        System.out.println("area of Circle is ");
//        return 3.14*radius*radius;
//    }
    public void calculateArea(int length,int breadth){
        System.out.println("area of Rectangle is "+ length*breadth);
    }
}
public class OverloadHappen {
    public static void main(String args[]){
        Shapes shape = new Shapes();
//        shape.area(10);
//        shape.area(5);
        shape.calculateArea(20,30);
    }
}

// java: method area(int) is already defined in class Polymorphism.Shapes