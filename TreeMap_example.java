import java.util.*;

public class TreeMap_example {
    public static void main(String[] args) {
        TreeMap tm =new TreeMap();
        tm.put(100, "zzz");
        tm.put(103, "yyy");
        tm.put(102,"XXX");
        System.out.println(tm);
    }
    static class Mycomparator implements Comparator{

        @Override
        public int compare(Object o1, Object o2){
            Integer i1=(Integer) o1;
            Integer i2=(Integer) o2;
            return i2.compareTo(i1);
        }
   }
}
