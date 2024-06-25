import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example_IO_exception  {
    public static void main(String[] args) {
        m1();
        }
        private static void m1(){
        m2();
    }
    private  static void m2(){
        try{
            PrintWriter pr = new PrintWriter("abcd.txt");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
    }
}
}
