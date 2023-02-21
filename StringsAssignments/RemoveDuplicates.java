package StringsAssignments;
class CharacterRemove{
    void display(){
        String str="yashpaliwal";
        String newstr = new String();
        int length = str.length();
        for (int i = 0; i < length; i++)
        {
            char charAtPosition = str.charAt(i);
            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }
        System.out.println(newstr);

    }
}
public class RemoveDuplicates {
    public static void main(String args[]){
        CharacterRemove characterRemove = new CharacterRemove();
        characterRemove.display();
    }
}
