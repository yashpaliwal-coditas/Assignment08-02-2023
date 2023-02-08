package Assignmenteightfab;
import java.util.*;
class ArrayCopy{
    public void implement(){
        int[] arr={23,445,65,43,32,21,98,75};
        int[] arr1=Arrays.copyOf(arr, arr.length);
        System.out.println("Array copy in another array "+Arrays.toString(arr1));
    }
}
public class Question3 {
    public static void main(String args[]){
        ArrayCopy arrayCopy=new ArrayCopy();
        arrayCopy.implement();

    }
}
// output
//Array copy in another array [23, 445, 65, 43, 32, 21, 98, 75]
//
//Process finished with exit code 0
