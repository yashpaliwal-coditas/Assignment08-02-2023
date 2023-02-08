package Assignmenteightfab;
import java.util.*;
class FindElement{
    public void find(int index){
        int[] arr={23,445,65,43,32,21,98,75,21,65};
        System.out.println("Element at the index is "+arr[index]);

    }
}
public class Questionsix {
    public static void main(String args[]){
        FindElement findElement=new FindElement();
        System.out.println("Enter the index");
        Scanner sc=new Scanner(System.in);
        findElement.find(sc.nextInt());
    }
}
