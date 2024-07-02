package Java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example_ImmutableList {
    public static void main(String[] args) {
        List<Integer> t = new ArrayList();
        t.add(10);
        t.add(20);
        t.add(40);
        t.add(30);
        t.add(60);
        System.out.println(t);
        List al = List.of(t);   // this is used to make the exisiting  list immutable
        List all = List.of(10, 20, 30, 40);  // this is used to make a new immutable list
        Set s = Set.of(20, 20, 40);   //  to make the set immutable
// You can do this with any type of collection objects
        t.sort((i1, i2) -> (i1 < i2) ? +1 : (i1 < i2) ? -1 : 0);
        List sortedset = t.stream().sorted((i1, i2) -> (i1 < i2) ? +1 : (i1 < i2) ? -1 : 0).collect(Collectors.toList());
        System.out.println(sortedset);

//        System.out.println(t.stream().count());
    }

}
