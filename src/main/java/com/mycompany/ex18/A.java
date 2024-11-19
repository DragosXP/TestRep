package com.mycompany.ex18;

public class A {

    String a1;
    int a2;

    A() {
        a1 = "<gol>";
        a2 = 0;
    }

    A(String a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    A(A a) {
        this.a1 = a.a1;
        this.a2 = a.a2;
    }

    @Override
    public String toString() {
        return "\n> Clasa: " + this.getClass().getSimpleName() + "\na1 = " + a1 + "\na2 = " + a2;
    }

    void testareInstante() {
        if (a2 > 200 && a1.contains("aaa")) {
            System.out.println(toString());
        }
    }
}
