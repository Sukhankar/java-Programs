package Synchornization1;

public class Display {
    public synchronized void wish(String name){
        for (int i=0;i<10;i++){
            System.out.println("happy Brithday "+name);
        }
    }
}
