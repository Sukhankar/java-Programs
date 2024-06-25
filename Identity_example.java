import java.util.*;

public class Identity_example {
    public static void main(String[] args) {
        IdentityHashMap i = new IdentityHashMap();
        String s1 =new String("Shubh");
        String s2 = new String("Shubh");
        i.put(s1,"Kohli");
        i.put(s2, "Dhoni");
        System.out.println(i);
    }
}
