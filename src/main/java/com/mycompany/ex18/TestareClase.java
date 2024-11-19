package com.mycompany.ex18;

public class TestareClase {

    public static void main(String[] args) {

        // Testare constructori fara argumente
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        System.out.println(">>> Testare constructori fara argumente");
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(c1.toString());
        System.out.println("------------------------------------------------------------------------");

        // Testare constructori cu argumente
        A a2 = new A("A2 Exemplu", 250);
        B b2 = new B("B2 TestaaaTest", 300, 12.34, true);
        C c2 = new C("C2 qwertyaaauiop", 80, 5.67f, 'A');

        System.out.println(">>> Testare constructori cu argumente");
        System.out.println(a2.toString());
        System.out.println(b2.toString());
        System.out.println(c2.toString());
        System.out.println("------------------------------------------------------------------------");

        // Testare constructori de copiere
        A a3 = new A(a2);
        B b3 = new B(b2);
        C c3 = new C(c2);

        System.out.println(">>> Testare constructori de copiere");
        System.out.println(a3.toString());
        System.out.println(b3.toString());
        System.out.println(c3.toString());
        System.out.println("------------------------------------------------------------------------");

        // Testare instante
        System.out.println(">>> Instantele care au valori mai mari decat 200 si contin sirul \"aaa\"");
        a1.testareInstante();
        a2.testareInstante();
        a3.testareInstante();
        b1.testareInstante();
        b2.testareInstante();
        b3.testareInstante();
        c1.testareInstante();
        c2.testareInstante();
        c3.testareInstante();
        System.out.println("------------------------------------------------------------------------");
    }
}
