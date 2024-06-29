package Java8;

public class DefaultInterfaceUse implements InterfaceA {
    @Override
    public void sum(){
        System.out.println("i am abstract method ");
    }

    public static void main(String[] args) {
        InterfaceA.multiply();
        DefaultInterfaceUse d = new DefaultInterfaceUse();
        d.substract();
        d.sum();
    }
    @Override
    public void substract() {
        InterfaceA.super.substract();
    }
}
