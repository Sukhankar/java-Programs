public class Parent_Thread {
    public static void main(String[] args) throws InterruptedException {
//        Example_of_thread th = new Example_of_thread();
//        th.start();
        Example_runnable_thread tr = new Example_runnable_thread();
        Thread t = new Thread(tr);
        t.start();
        t.join();
        for(int i=0;i<5;i++){
            System.out.println("I am parent thread");
        }
    }
}
// in this program there are two threads
//main thread starts the child thread as we know main method is not thread main method is executed by main thread
//that is main thread is responsible to execute main method
