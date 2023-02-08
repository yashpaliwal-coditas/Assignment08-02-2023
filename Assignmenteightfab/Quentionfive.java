package Assignmenteightfab;
class JaggedArray{
    public void add(){
        int[][] array1 = {{1,2,3}, {4,5,6,7}, {8,9}};
        int[][] array2 = {{10,11,12}, {13,14,15,16}, {17,18}};
        System.out.print("{");
        for(int i= 0;i< array1.length;i++){
            System.out.print("{");
            for(int j=0;j<array1[i].length;j++){
                int x=array1[i][j]+array2[i][j];
                System.out.print(x+" ,");
            }System.out.print("},");
        }
        System.out.print("}");
    }
}
public class Quentionfive {
    public static void main(String args[]){
        JaggedArray jaggedArray=new JaggedArray();
        jaggedArray.add();
    }
}
//output:-
//{{11 ,13 ,15 ,},{17 ,19 ,21 ,23 ,},{25 ,27 ,},}
//Process finished with exit code 0
