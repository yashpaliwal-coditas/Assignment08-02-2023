package Assignment20feb;

import java.nio.charset.StandardCharsets;

class StringImplementation{
    public void display(){
        String str = "Yash Paliwal";
        System.out.println(str.equals("Yash Paliwal"));
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("as"));
        System.out.println(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(str.getBytes());
        System.out.println();
        System.out.println(str.intern());
        System.out.println();
        System.out.println(str.isEmpty());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.replace("as","AS"));
        System.out.println(str.charAt(3));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointCount(1,7));
        System.out.println(str.compareToIgnoreCase("yash paliwag"));
        System.out.println();
        String name=new String("Yash Paliwal");
        String arr[]=name.split(" ");
        for(String st:arr){
            System.out.println(st);
        }
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePoints());
        System.out.println(str.equalsIgnoreCase("yash paliwal"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("Yash"));
        System.out.println(str.indexOf('a',3));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf('a',4));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));
        System.out.println(str.startsWith("Yash"));
        System.out.println(str.endsWith("wal"));
        System.out.println(str.concat(" is a coder"));
        System.out.println(str.hashCode());
        System.out.println(str.trim());
    }
}
public class StringsFunctions {
    public static void main(String args[]){
        StringImplementation stringImplementation = new StringImplementation();
        stringImplementation.display();
    }
}
