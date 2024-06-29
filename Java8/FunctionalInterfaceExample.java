package Java8;

// In  functional interface we can't write two abstract methods

@FunctionalInterface
public interface FunctionalInterfaceExample {
    public void M1(int a,int b);


//    public static void M2(){
//        System.out.println("i am static method");
//    }
//    @FunctionalInterface
//    this interface does not become the functional interface because it has the two methods one inside it and other above it i.e m1() as it extends the interface
//      interface functional extends FunctionalInterfaceExample{
//        public void M3();
    }

