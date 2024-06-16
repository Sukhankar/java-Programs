import java.util.*;

public class Sum_of_array{
    public static void main(String[] args){
        System.out.println("Enter the length of an array :- ");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Elements in the array:- ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum + arr[i];
        }
        System.out.println("The sum of the array is "+sum);
    }

}