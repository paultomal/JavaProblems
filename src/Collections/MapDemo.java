package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a" , "e11");
        var c2 = new Customer("b" , "e12");
        var c3 = new Customer("c" , "e13");

        Map<String,Customer> map = new HashMap<>();
        map.put(c1.getEmail(),c1);
        map.put(c3.getEmail(),c3);
        map.put(c2.getEmail(),c2);

        var customer = map.get("e11");
        System.out.println(customer);
    }
}
