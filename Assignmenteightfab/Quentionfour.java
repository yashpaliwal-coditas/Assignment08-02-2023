package Assignmenteightfab;
import java.util.*;
class RemoveDuplicate{
    public void implement(){
        int[] arr={23,445,65,43,32,21,98,75,21,65};
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Array with duplicates "+Arrays.toString(arr));
        for(int element:arr){
            if(list.contains(element)){
                continue;
            }
            else{
                list.add(element);
            }
        }
        System.out.println("Duplicates are deleted "+list);
    }
}
public class Quentionfour {
    public static void main(String args[]){
        RemoveDuplicate removeDuplicate=new RemoveDuplicate();
        removeDuplicate.implement();
    }
}
