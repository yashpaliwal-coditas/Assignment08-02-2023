package StringsAssignments;
class SpaceCode{
    void display(){
        String name="  yash paliwal  ";
        name=name.trim();
        System.out.println(name.codePointAt(5));
    }
}
public class RemoveSpace {
    public static void main(String args[]){
        SpaceCode spaceCode = new SpaceCode();
        spaceCode.display();
    }
}
