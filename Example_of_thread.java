public class Example_of_thread extends Thread {
    public static void main(String[] args) {

    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("I am child thread");
        }}
}
