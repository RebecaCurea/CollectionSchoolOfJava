import java.util.*;

public class First {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            intList.add(i);
        }
       /* System.out.println("\nPrint only even numbers (1-10):");
        for (Integer s : intList) {
            if (s % 2 == 0) {
                System.out.println(s);
            }
        }*/
        System.out.println("\nPrint only even numbers (1-10):");
        Iterator<Integer> iter = intList.iterator();
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number % 2 == 0)
                System.out.println(number);
        }
        System.out.println("\nSET:");
        Set<String> setString = new HashSet<>();
        setString.add("Ana");
        setString.add("Ana");
        setString.add("Ana");
        setString.add("Maria");


        Iterator<String> setIterator = setString.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Timisoara", 20);
        map.put("Oradea", 22);
        map.put("Bucuresti", 5);
        map.put("Lugoj", 7);
        map.put("Deva", 13);

        System.out.println("\nMAP:");
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            if (s.getValue() > 10)
                System.out.println("key:" + s.getKey());
        }


    }
}