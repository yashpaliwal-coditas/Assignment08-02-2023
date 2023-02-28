package assignment28feb;
class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("My name is yash");
    }
}
public class RunnableDemo {
    public static void main(String args[]){
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);
        thread.run();
        thread.checkAccess();
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
        System.out.println(thread.getStackTrace());
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.isInterrupted());


    }
}
