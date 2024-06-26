public class Example_of_finally {
    public static void main(String[] args) {
        Example_of_finally nf = new Example_of_finally();
        nf.m1();
       System.out.println("this is the Example of try catch and finally ");
    }
    private void m1(){
        try{
//            System.exit(0);

            System.out.println(10/0);

        }
        catch (NullPointerException n){
            System.out.println("this is the null pointer exception");
        }
//        The finally doesn't run only when the jvm is off i.e when we use System.exit()
//        If we pass 0 in the exit(0) it executes normally and it is none zero then it executes abnormaly
        finally {
            System.out.println("This is the finally");

        }
        System.out.println("this is the m1 functions try catch block");


    }
}
