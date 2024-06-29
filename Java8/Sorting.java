package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List al =new ArrayList();
        al.add(20);
        al.add(10);
        al.add(30);

        Comparator<Integer> c= (i1,i2) -> (i1<i2)? +1 :(i1>i2)?-1 : 0;
        Collections.sort(al,c);
        System.out.println(al);
    }
}
