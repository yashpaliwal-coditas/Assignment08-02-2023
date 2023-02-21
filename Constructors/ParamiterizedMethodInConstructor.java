package Constructors;
class Side{
    int area(int length,int breadth){
        return length*breadth;
    }
}
class Cuboids extends Side{
    int height;
    int area;

    public Cuboids(int length,int breadth,int height) {
        this.height = height;
        this.area= area(length,breadth);
    }

    @Override
    public String toString() {
        return "Cuboids{" +
                "height=" + height +
                ", area=" + area +
                '}';
    }

}
public class ParamiterizedMethodInConstructor {
    public static void main(String args[]){
        Cuboids cuboids = new Cuboids(12,45,50);
        System.out.println(cuboids);

    }
}
//Cuboids{height=50, area=540}
//
//Process finished with exit code 0