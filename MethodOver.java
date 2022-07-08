class D {
    int x, y;

    D(int z, int p) {
        x = z;
        y = p;

    }

    int pow() {
        return x + y;
    }}

    class E {
        int pow(int n) {
            return n * n;
        }
    }

    class F {
        int pow(int x, int powr) {
            return x * powr;
        }
    }


    public class MethodOver {
        public static void main(String args[]) {
D p=new D(1,3);
System.out.println(p.pow());
E q=new E();
int a= q.pow(10);
            System.out.println(a);
            F r=new F();
            System.out.println(r.pow(10,3));


        }
    }
