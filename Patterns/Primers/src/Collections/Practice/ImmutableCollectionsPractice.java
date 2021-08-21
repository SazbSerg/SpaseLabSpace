package Collections.Practice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionsPractice {
    public static void main(String[] args) {
        List<String> list = List.of("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун");
        System.out.println(list);
        System.out.println();

        Set<String> set = Set.of();
        set.add("first");
        set.add("second");
        set.add("third");
        System.out.println(set);
        System.out.println();

        Map<String, String> map = Map.of("12/09/1990","Hayley Adams", "5/04/1884", "Richard Lupkes" );
        System.out.println(map);
        System.out.println();

       // list.remove("Земля");
       // System.out.println(list);

       // set.add("fourth");
    }
}
