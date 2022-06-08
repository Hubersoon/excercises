package forAdvanced.ex1;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        Pair<Integer> first = new Pair<>(24, 28);
        Pair<String> second = new Pair<>("Greg", "John");
        Pair<Character> third = new Pair<>('e', 'e');
        Pair<Double> fourth = new Pair<>(0.01, 0.011);


        System.out.println(first.max());
        System.out.println(second.max());
        System.out.println(third.max());
        System.out.println(fourth.max());

    }
}
