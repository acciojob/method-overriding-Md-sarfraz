package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B objB = new B();
        System.out.println(((A) objB).meth()); // Calls method meth of class A using object of class B

        System.out.println(objB.meth()); // Calls overridden method meth in class B
    }
}
