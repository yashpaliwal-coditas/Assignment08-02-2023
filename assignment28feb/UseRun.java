package assignment28feb;
class ThreadsDemos extends Thread{
    public void run(){
        System.out.println("my name is yash");
    }
}
public class UseRun {
    public static void main(String args[]){
        ThreadsDemos threadsDemos = new ThreadsDemos();
        threadsDemos.run();
//        threadsDemos.start();
//        threadsDemos.start();
    }
}
//my name is yash
//
//Process finished with exit code 0
// by using run it directly calls overridden run method of the class
// If we try to restart a single thread than it will throw a runtime exception that is
//Exception in thread "main" java.lang.IllegalThreadStateException
//	at java.lang.Thread.start(Thread.java:710)
//	at assignment28feb.UseRun.main(UseRun.java:12)