class A {

    private int privateVar = 10;         // private
    public int publicVar = 20;           // public
    protected int protectedVar = 30;      // protected
    int defaultVar = 40;                 // default

    void displayA() {
        System.out.println("Private: " + privateVar);
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

class B extends A {   // subclass

    void displayB() {
        // System.out.println(privateVar);  ❌ private not accessible
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar); // same package, so accessible
    }
}

public class accessModifier {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        System.out.println("----Access Within Class A----");
        objA.displayA();

        System.out.println("\n----Access in Subclass B----");
        objB.displayB();

        System.out.println("\n----Access Using Object of A----");
        System.out.println(objA.publicVar);     // ✔ accessible
        // System.out.println(objA.privateVar); ❌ not accessible
        // System.out.println(objA.protectedVar); (✔ only within same package)
        // System.out.println(objA.defaultVar);   (✔ only within same package)
    }
}
