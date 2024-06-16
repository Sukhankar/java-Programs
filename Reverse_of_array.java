import java.util.*;

public class Reverse_of_array {
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

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            if (i==-1){
                break;
            }
        }
    }
}
