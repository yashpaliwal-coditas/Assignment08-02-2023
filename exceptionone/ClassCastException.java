package exceptionassignment.exceptionone;
class DemoCastParent{
    int id;

    public DemoCastParent(int id) {
        this.id = id;
    }

    void display(){
        System.out.println(id);

    }
}
class DemoCastChild extends DemoCastParent {
    String name;
    public DemoCastChild(int id,String name) {
        super(id);
        this.name = name;
    }
    void displays(){
        System.out.println(id+" "+name);
    }
}
public class ClassCastException {
    public static void main(String args[]){
        DemoCastParent demoCastParent = new DemoCastParent(65);
        try{
        DemoCastChild demoCastChild = (DemoCastChild) demoCastParent;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Exception is handeled");
        }

    }
}
//"C:\Program Files\Java\jdk1.8.0_361\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=57088:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_361\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\rt.jar;C:\Users\Coditas\IdeaProjects\javaaclasswork\out\production\javaaclasswork" exceptionassignment.exceptionone.ClassCastException
//java.lang.ClassCastException: exceptionassignment.exceptionone.DemoCastParent cannot be cast to exceptionassignment.exceptionone.DemoCastChild
//Exception is handeled
//
//Process finished with exit code 0