import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<>();
        a.add("Sophia");
        a.add("Emma");
        a.add("Isabella");
        a.add("Olivia");
        a.add("Ava");
        System.out.println("----------------------");


        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        ArrayList<String> b = new ArrayList<>();
        b.add("Lily");
        b.add("Chloe");
        b.add("Madison");
        b.add("Emily");
        b.add("Abigail");
        System.out.println("--------------------------");

        for (int j = 0; j < b.size(); j++) {
            System.out.println(b.get(j));
        }


        System.out.println("------------------------");


        ArrayList<String> C = new ArrayList<>(a);
        C.addAll(b);
        System.out.println(C);

        System.out.println("--------------------------");

     List<String> sorted = C.stream().sorted(Comparator.comparingInt(String :: length)).collect(Collectors.toList());
        System.out.println(sorted);
    }
}