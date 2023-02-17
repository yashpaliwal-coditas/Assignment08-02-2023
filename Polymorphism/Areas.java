package Polymorphism;
class Shape{
    public void area(int side){
        System.out.println("area of square is "+ side*side);
    }
    public void area(float radius){
        System.out.println("area of Circle is "+ 3.14*radius*radius);
    }
    public void area(int length,int breadth){
        System.out.println("area of Rectangle is "+ length*breadth);
    }
}
public class Areas {
    public static void main(String args[]){
        Shape shape = new Shape();
        shape.area(10);
        shape.area(5.7f);
        shape.area(20,30);
    }
}
//Area is : 408
//Area is : 1350
//Rectangle{l=12, b=34}
//Triangle{base=54, height=50}
//
//Process finished with exit code 0
