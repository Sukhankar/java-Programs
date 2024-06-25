public class Example_auto_exception {
    public static void main(String[] args) {
        m1();
    }
    private static void m1(){
        m2();
    }
    private  static void m2(){
//        System.out.println(10/0);     //This is the auto exception where the jvm will call dispacther exception
       
//       This is the gracefull exception
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(10/10);
        }
    }
}
