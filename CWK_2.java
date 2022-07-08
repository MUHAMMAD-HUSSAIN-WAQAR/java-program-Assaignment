class  A{
    int x, y;

   A() {
        x = 10;
        y = 20;

    }

    void add() {
        System.out.println(x + y);

    }
}
    class B extends A {
        int z;

        B() {
            x = 30;
            y = 40;
            z = 40;

        }


        void add() {
            System.out.println(x + y + z);

        }
    }

    public class
    CWK_2 {
        public static void main(String args[]) {
            A p = new A();
            B q = new B();
            p.add();
            q.add();

        }
    }
