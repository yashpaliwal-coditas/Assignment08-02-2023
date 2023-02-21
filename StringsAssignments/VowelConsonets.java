package StringsAssignments;
class Count{
    void display(){
        String name="yashpaliwal";
        int vowel=0,consonent=0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                 vowel++;
             }
             else{
                 consonent++;
             }
        }
        System.out.println("number of vowels are : "+vowel);
        System.out.println("number of Consonents are : "+consonent);
    }
}
public class VowelConsonets {
    public static void main(String args[]){
        Count count = new Count();
        count.display();
    }
}
