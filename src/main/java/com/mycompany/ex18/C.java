package com.mycompany.ex18;

public class C extends A {

    float c1;
    char c2;

    C() {
        c1 = 0f;
        c2 = '#';
    }

    C(String a1, int a2, float c1, char c2) {
        super(a1, a2);
        this.c1 = c1;
        this.c2 = c2;
    }

    C(C c) {
        super(c);
        this.c1 = c.c1;
        this.c2 = c.c2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nc1 = " + c1 + "\nc2 = " + c2;
    }
}
