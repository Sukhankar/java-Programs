package DaemonPackage;

public class DaemonThread_example {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
//        Thread.currentThread().setDaemon(true);
        Mythread t =new Mythread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
        t.start();
        System.out.println("main thread deamon");
    }
}
