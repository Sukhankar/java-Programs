import java.util.Comparator;
import java.util.TreeSet;

public class String_caparator_example {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new Mycomparator());
        ts.add("Robin");
        ts.add("Goku");
        ts.add("Gojo");
        ts.add("Sukhankar");
        ts.add("Sam");
        ts.add("Gon");
        ts.add("Apex");

        System.out.println(ts);
    }
    static class Mycomparator implements Comparator<String>{
        @Override
        public int compare(String o1,String o2) {
            return -o1.compareTo(o2);
        }
    }
}
