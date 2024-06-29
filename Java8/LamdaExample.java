package Java8;

public class LamdaExample {
    public static void main(String[] args) {
        FunctionalInterfaceExample i = (int a,int b)->{
            System.out.println("hello");
            System.out.println(a+b);
        };
        i.M1(10,20);
    }
}
// Curly braces are not mandetry until there is no return type