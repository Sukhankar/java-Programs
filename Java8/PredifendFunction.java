package Java8;

import java.util.function.Consumer;
import java.util.function.Function;

public class PredifendFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i->i*i;
        System.out.println(f.apply(4));

        Consumer<String> c = s1-> System.out.println(s1.length());
        c.accept("shubh");
    }
}

// Questions for home work......
// take some input perform some conditional check and return boolean values
// take some input and perform some operations and return the result which is needed but not to be boolean is function
// Accept some and perform some operations and do not return anything is consumer