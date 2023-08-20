package LinkedHashMapExample;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> profile = new LinkedHashMap<>();
        profile.put(1,"Paul1");
        profile.put(2,"Paul2");
        profile.put(3,"Paul3");
        profile.put(4,"Paul4");

        System.out.println(profile);

        System.out.println(profile.get(1));

        System.out.println(profile.isEmpty());
    }
}
