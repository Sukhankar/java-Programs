package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {

    public static void main(String[] args) {
        List<Integer> t = new ArrayList();
        t.add(10);
        t.add(20);
        t.add(40);
        t.add(30);
        t.add(60);
        System.out.println(t);
        List stotingeven = t.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(stotingeven);
        t.sort((i1,i2)->(i1<i2)?+1:(i1<i2)?-1:0);
        System.out.println(t.stream().count());

    }
}
