package com.sourcegraph.test.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Arrays.sort(new String[] {}, String::compareTo);
        Comparator<Foo> c = Comparator.comparing(s -> s.bar);
        c = c.thenComparing((s) -> 0);
        Arrays.sort(new String[] {},
                (a, b) -> Integer.compare(a.length(), b.length()));
        Baz baz = () -> {System.out.print("hi");};
        Arrays.stream(new String[] {}).map(s -> baz);
    }

    private static class Foo {
        private String bar;
        private String baz;
    }

    private interface Baz {
        void quxx();
    }

}
