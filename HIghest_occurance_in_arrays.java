import java.util.Scanner;

public class HIghest_occurance_in_arrays {
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
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                count+=1;
                
            }
        }
        System.out.println("the maximum number in the array is "+max);
        System.out.println(count);

    }
}
