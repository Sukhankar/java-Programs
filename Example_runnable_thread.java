public class Example_runnable_thread implements Runnable{
    public static void main(String[] args) {

    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("I'm in runnable class");
        }
    }
}
