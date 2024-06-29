package Java8;

import java.util.function.Predicate;



public class Predefined_funtionalInterface {
    public static void main(String[] args) {
        String [] s= {"shubh", "Kholi", "Komal", "Dhoni"};
//        predicate has the method test which returns boolean value
        Predicate<String> p = s1 -> s1.length() > 3 ;    // we can write s1 as (s1)
        for(String s2 : s){
            if(p.test(s2)){
                System.out.println(s2);
            }
        }
    }
}
