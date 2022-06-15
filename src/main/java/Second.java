import java.util.*;

public class Second {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);

        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (!newList.contains(i)) {
               newList.add(i);
            }
        }
        System.out.println("\nEliminate duplicate");
        for (Integer integer : newList) {
            System.out.println(integer);

        }

        System.out.println("\nSort elements");
        Collections.sort(newList, Collections.reverseOrder());
        for (Integer integer : newList) {
            System.out.println(integer);

        }

        System.out.println("\nSet:");
        Set<String> set=new HashSet<>();
        for(Integer i : newList){
            set.add(String.valueOf(i));
        }
        for (String s : set) {
            System.out.println(s);

        }

        System.out.println("\nMap:");
        Map<String, Integer> map=new HashMap<>();
        Iterator<String> stringIterator= set.iterator();
        Iterator<Integer> integerIterator= newList.iterator();
        while(stringIterator.hasNext()) {
            map.put(stringIterator.next(), integerIterator.next());
        }

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println("key:" +s.getKey() + "  value:" + s.getValue());
        }


    }
}