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
            e.printStackTrace();  //gives the full describtion
            e.getMessage();   //gives the eception cause only
            e.toString();     //gives the name of exception and its cause
    }
}
}
