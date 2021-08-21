package Collections.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashHash {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();

        set.add("Hello");

        set.add("world");

        set.add("Hello");

        System.out.println ("Размер коллекции:" + set.size ());

        System.out.println ("Элементы в коллекции:" + set.toString ());

    }
    HashSet<String> hashSetString= new HashSet<>();
    Map<String, Integer> map = new HashMap<>();
    HashMap<String, String> hashMap = new HashMap<>();


    void sss (){
        map.put("Id", 21212121);
        map.put("Id1", 22233223);
        hashMap.put("number", "one");
        hashMap.put("huamber", "two");
        map.get(21212121);
        System.out.println(map);
        System.out.println(hashMap);
        System.out.println(map.get("Id"));
        hashSetString.add("One");
        hashSetString.add("Two");
        hashSetString.add("Three");

        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);

        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        //System.out.println(hashSetString);
        hashSetString.add("four");
        for(String hs: hashSetString){
       // System.out.println(hs);

    }


    }


}

