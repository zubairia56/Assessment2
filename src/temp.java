abstract class test {

    public static void ml() {

        System.out.println("method1");
    }

    public static void m2() {

        System.out.println("method2");
    }
}

    public class temp extends test {
        public static void main(String[] args) {

            test.ml();

            temp t1 = new temp();

            t1.ml();

        }
    }

