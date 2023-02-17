package Polymorphism;
class Addition{
    void add(int a,int b){
        System.out.print("Addition of 2 numbers : ");
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.print("Addition of 3 numbers : ");
        System.out.println(a+b+c);
    }
    void add(int a,int b,int c,int d){
        System.out.print("Addition of 4 numbers : ");
        System.out.println(a+b+c+d);
    }
}
class VarargsAddition{
    public void sum(int ...arr){
        int result =0;
        for(int a: arr){
            result +=a;
        }
        System.out.println("Addition of values is "+result);
    }
}
public class MainApplication {
    public static void main(String args[]){
        Addition addition = new Addition();
        addition.add(54,89);
        addition.add(54,89,87);
        addition.add(54,89,45,29);
        VarargsAddition varargsAddition = new VarargsAddition();
        varargsAddition.sum(56,86,94,84,92,27);
    }
}
//"C:\Program Files\Java\jdk1.8.0_361\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=60125:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_361\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\rt.jar;C:\Users\Coditas\IdeaProjects\javaaclasswork\out\production\javaaclasswork" Polymorphism.MainApplication
//Addition of 2 numbers : 143
//Addition of 3 numbers : 230
//Addition of 4 numbers : 217
//Addition of values is 439
//
//Process finished with exit code 0