package Java8;

public class MethodReference {
    public  static void m1(){
        for (int i = 0; i <10; i++) {
            System.out.println("child thread");
        }
    }
    public MethodReference(){
        System.out.println("i am a constructur");
    }

    public static void main(String[] args) {
        // arguments must match the called method
//        Runnable r = MethodReference ::m1;
        // if the method is non static method then we have to create the object of the class and pass the object reference

        Runnable r = MethodReference :: new;

        Thread t = new Thread();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main Thread");
        }
    }
}
