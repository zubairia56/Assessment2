abstract class arithmetic {
    public abstract void add();

    public abstract void diff();
}

public class AbstractMethods extends arithmetic {

    public void add() {

        System.out.println("Add method");
    }

    public void diff() {
        System.out.println("diff method");
    }

    public static void main(String[] args) {

        AbstractMethods f = new AbstractMethods();
        f.add();
        f.diff();

    }
}
