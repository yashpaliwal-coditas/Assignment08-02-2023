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
//"C:\Program Files\Java\jdk1.8.0_361\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=60371:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_361\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\rt.jar;C:\Users\Coditas\IdeaProjects\javaaclasswork\out\production\javaaclasswork" Assignment20feb.StringsFunctions
//true
//yash paliwal
//true
//[B@1b6d3586
//[B@4554617c
//
//Yash Paliwal
//
//false
//YASH PALIWAL
//12
//YASh Paliwal
//h
//97
//6
//5
//
//Yash
//Paliwal
//89
//java.util.stream.IntPipeline$Head@3d075dc0
//true
//1
//0
//6
//10
//1
//h Paliwal
//h P
//true
//true
//Yash Paliwal is a coder
//1073137457
//Yash Paliwal
//
//Process finished with exit code 0
