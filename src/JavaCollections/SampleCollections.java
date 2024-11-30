package JavaCollections;

import java.util.*;

public class SampleCollections {

        public static void main(String[] args) {
            //list
            List<String> listNames = new ArrayList<>();
            listNames.add("Tom");
            listNames.add("Mary");
            listNames.add("Peter");
            listNames.add("John");
            listNames.add("Kim");

            for (String name : listNames) {
                System.out.println(name);
            }

            Iterator<String> iterator = listNames.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            //lambda
            listNames.forEach(name -> System.out.println(name));

            //Set
            Set<String> setNames = new HashSet<>();
            setNames.add("Tom");
            setNames.add("Mary");
            setNames.add("Peter");
            setNames.add("John");
            setNames.add("Kim");

            for (String name : setNames) {
                System.out.println(name);
            }
            //lambda
            setNames.forEach(name -> System.out.println(name));

            Iterator<String> iterator1 = setNames.iterator();
            while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
            }


            //Map
            Map<Integer, String> mapNames = new HashMap<>();
            mapNames.put(1, "Tom");
            mapNames.put(2, "Mary");
            mapNames.put(3, "Peter");
            mapNames.put(4, "John");
            mapNames.put(5, "Kim");

            for (Map.Entry<Integer, String> entry : mapNames.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            //lambda
            mapNames.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));


        }
}

