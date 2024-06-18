import java.util.*;

public class String_space_replace_array {
    public static void main(String[] args) {
        
        System.out.println("Enter the string ");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        sc.close();
        a=a.replace(" ", "5");
        System.out.println(a);
    }
}
