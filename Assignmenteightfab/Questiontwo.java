package Assignmenteightfab;
import java.util.*;
class AscendingDescending{
    public void display(){
        int[] arr={23,445,65,43,32,21,98,75};
        Arrays.sort(arr);
        System.out.println("Ascending order "+Arrays.toString(arr));
        Integer[] arr1={23,445,65,43,32,21,98,75};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("Descending order "+Arrays.toString(arr1));
    }
}
public class Questiontwo {
    public static void main(String args[]){
        AscendingDescending ad=new AscendingDescending();
        ad.display();

    }
}
