package Synchornization1;

public class Example_synchronazation {
    public static synchronized void main(String[] args) {   // using the static keyword we can enable class level lock which allows only one object or class to be executed by thread
        Display d = new Display();
        MyThread t1 = new MyThread(d,"Dhoni");
        MyThread t2 = new MyThread(d,"Kholi");
        t1.start();
        t2.start();

    }
}
