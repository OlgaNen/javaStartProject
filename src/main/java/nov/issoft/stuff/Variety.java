package nov.issoft.stuff;

import java.util.ArrayList;
import java.util.List;

public class Variety {
    public static void main(String[] args) {
        ArrayList<String> firstNameA = new ArrayList<String>();
        firstNameA.add("Olga");
        firstNameA.add("Artem");
        firstNameA.add("Alexandra");
        firstNameA.add("Irina");
        firstNameA.add("Anna");

        ArrayList<String> firstNameB = new ArrayList<String>();
        firstNameB.add("Mihail");
        firstNameB.add("Irina");
        firstNameB.add("Anna");
        firstNameB.add("Nasty");
        firstNameB.add("Natalia");

        intersection(firstNameA, firstNameB);
        symmetricDifference(firstNameA, firstNameB);
        union(firstNameA, firstNameB);
        subtract(firstNameA, firstNameB);
    }

     public static void intersection(List<String> firstNameA, List<String> firstNameB) {
        List<String> result = new ArrayList<>();
        for (String s : firstNameA) {
            if (firstNameB.contains(s)) {
                result.add(s);
            }
        }

        System.out.println(result);
     }

     public static void symmetricDifference (List<String> firstNameA, List<String> firstNameB) {
         List<String> result = new ArrayList<>();
         for (String s : firstNameA) {
             if (!firstNameB.contains(s)) {
                 result.add(s);
             }
         }

         for (String s : firstNameB) {
             if (!firstNameA.contains(s)) {
                 result.add(s);
             }
         }

         System.out.println(result);
     }

     public static void union (List<String> firstNameA, List<String> firstNameB) {
         List<String> result = new ArrayList<>(firstNameA);
         for (String s : firstNameB) {
             if (!result.contains(s)) {
                 result.add(s);
             }
         }
         System.out.println(result);
     }

    public static void subtract (List<String> firstNameA, List<String> firstNameB) {
        List<String> result = new ArrayList<>();
        for (String s : firstNameA) {
            if (!firstNameB.contains(s)) {
                result.add(s);
            }
        }

        System.out.println(result);
    }
}
