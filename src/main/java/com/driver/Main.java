package com.driver;

public class Main {
    public static class A{
       public String meth(){
            return "this is first method";
        }
    }
    public static class B extends A{
      public String meth(){
            return "this is second method";
        }
    }

    public static void main(String[] args) {
        B obj =new B();
        obj.meth();
        B obj1=new B();
        obj1.meth();

    }
}