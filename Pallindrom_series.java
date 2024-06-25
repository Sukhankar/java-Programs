import java.util.*;

public class Pallindrom_series {

    public static void main(String[] args) {
        System.out.println("enter the number to check wheather it is the pallindrom series or not:-  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // sc.close();
        int num1=num;
        int num2=0;

        while (num1>0) {
            num2=num2*10+num1%10;
            num1=num1/10;
            
        }

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        if(num==num2){
            System.out.println("The given number is pallindrom number ");
        }
        else{
            System.out.println("the given number is not a pallindrom number");
        }
        sc.close();


    }
}