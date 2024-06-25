import java.util.*;

public class HashMap_Example {
    public static void main(String[] args) {
        Map hsm = new HashMap();
        Map hslm = new LinkedHashMap();
        System.out.println(hsm.put(1, "Suk"));
        System.out.println(hsm.put(2, "Shrub"));
        System.out.println(hsm.put(1, "Sukhankar"));
        System.out.println(hsm.put(3, "Ron"));
        System.out.println(hsm.put(4, "Diablo"));
        System.out.println(hsm.put(5, "Mahoraga"));
        System.out.println(hsm.put(3, "Sukuna"));


        Set allKeys = hsm.keySet();
        Collection allvalues = hsm.values();
        Set allentry = hsm.entrySet();

        Iterator itr = allentry.iterator();

        while(itr.hasNext()){
            Map.Entry allkeyvalues =(Map.Entry)itr.next();
            if(allkeyvalues.getKey().equals(4)){
                allkeyvalues.setValue("sachin tendulkar");
            }
        }

        System.out.println(allKeys);
        System.out.println(allvalues);
        System.out.println(allentry);

        System.out.println(hsm);
    }
}
