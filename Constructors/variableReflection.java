package Constructors;
import java.lang.reflect.Field;
class Student{
    private String name;
    private int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
public class variableReflection {
    public static void main(String args[]){
        try {
            Student student = new Student("Yash", 87);
            Field privateField = Student.class.getDeclaredField("name");

            privateField.setAccessible(true);
            String name = (String)privateField.get(student);

            // Print the value
            System.out.println("Name of Student:" + name);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//"C:\Program Files\Java\jdk1.8.0_361\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=59262:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_361\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\rt.jar;C:\Users\Coditas\IdeaProjects\javaaclasswork\out\production\javaaclasswork" Constructors.variableReflection
//Name of Student:Yash
//
//Process finished with exit code 0