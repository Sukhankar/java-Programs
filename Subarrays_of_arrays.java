import java.util.*;

public class Subarrays_of_arrays {
    public static void main(String[] args) {
        System.out.println("Enter the length of an array :- ");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Elements in the array:- ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int start_index=0;start_index<n;start_index++){
            for(int end_index=0;end_index<n;end_index++){
                for(int i=start_index;i<=end_index;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();

            }
        }
    }
    
}
