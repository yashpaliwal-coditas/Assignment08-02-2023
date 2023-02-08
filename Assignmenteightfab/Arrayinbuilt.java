package Assignmenteightfab;
import java.util.Arrays;
 class Arrayss {
     int[] arr={23,445,65,43,32,21,98,75};
     public void implement(){

         System.out.println(Arrays.toString(
                 Arrays.copyOf(arr, 10)));// return a copy of array of the new length
         int[] arr1=Arrays.copyOf(arr, 14);// return a copy of array of the new length in another array
         System.out.println(Arrays.toString(arr1));
         int[] arr2=Arrays.copyOfRange(arr,2,5);// return the array for the provided range of index
         System.out.println(Arrays.toString(arr2));
         int[][] arr4={{23,445,65,43,32,21,98,75}};
         int[][] arr5={{23,445,65,43,32,21}};
         System.out.println(Arrays.equals(arr,arr1));//compare 2 array
         System.out.println(Arrays.deepEquals(arr4,arr5)); // compare two 2D array objects
         Arrays.sort(arr1);//sort in ascending order
         System.out.println(Arrays.toString(arr1));
         System.out.println(43 + " found at index = "+ Arrays.binarySearch(arr1, 43));//binary search
         for(int element:arr){
             System.out.print(element+",");
         }

     }
 }
public class Arrayinbuilt {
    public static void main(String args[]){
        Arrayss ar=new Arrayss();
        ar.implement();
    }
}

// output
//        [23, 445, 65, 43, 32, 21, 98, 75, 0, 0]
//        [23, 445, 65, 43, 32, 21, 98, 75, 0, 0, 0, 0, 0, 0]
//        [65, 43, 32]
//        false
//        false
//        [0, 0, 0, 0, 0, 0, 21, 23, 32, 43, 65, 75, 98, 445]
//        43 found at index = 9
//        23,445,65,43,32,21,98,75,
//        Process finished with exit code 0
