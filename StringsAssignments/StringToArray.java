package StringsAssignments;
class ConvertString{
    void display(){
        String name="yash paliwal";
        char ch[]=name.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
public class StringToArray {
    public static void main(String args[]){
        ConvertString convertString = new ConvertString();
        convertString.display();
    }
}
