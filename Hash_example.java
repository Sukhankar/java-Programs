import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash_example {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("A");
        hs.add("A");
        hs.add(10);
        System.out.println(hs);


        LinkedHashSet lhs=new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("A");
        lhs.add(10);
        System.out.println(lhs.add(null));


        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("B");
//        ts.add(10);
        System.out.println(ts);
    }
}
