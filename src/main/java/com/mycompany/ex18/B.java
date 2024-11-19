package com.mycompany.ex18;

public class B extends A {

    double b1;
    boolean b2;

    B() {
        super();
        b1 = 0;
        b2 = false;
    }

    B(String a1, int a2, double b1, boolean b2) {
        super(a1, a2);
        this.b1 = b1;
        this.b2 = b2;
    }

    B(B b) {
        super(b);
        this.b1 = b.b1;
        this.b2 = b.b2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nb1 = " + b1 + "\nb2 = " + b2;
    }
}
