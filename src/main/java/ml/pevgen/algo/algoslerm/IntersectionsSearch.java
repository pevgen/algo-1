package ml.pevgen.algo.algoslerm;

import java.util.HashMap;
import java.util.List;


/**
 * сложность N + M
 */
public class IntersectionsSearch {


    public static void main(String[] args) {
        // N
        List<Person> list1 = List.of(
                new Person(1, "n1"),
                new Person(3, "n3"),
                new Person(8, "n8"));

        // M
        List<Person> list2 = List.of(
                new Person(3, "n3"),
                new Person(2, "n2"),
                new Person(12, "n12"),
                new Person(8, "n8"),
                new Person(555, "n555"));

        HashMap<Integer, Person> set2 = new HashMap<>();
        for (Person p : list2) {
            set2.put(p.id, p);
        }

        for (Person p : list1) {
            if (set2.containsKey(p.id)) {
                System.out.println(p.name);
            }
        }

    }

    private static class Person {
        Integer id;
        String name;

        public Person(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }

}
