abstract class AA {
    int x, y;

    AA(int a, int b) {
        x = a;
        y = b;
    }

    abstract int add();
}
class BB extends  AA
{
    BB(int a, int b)
    {
        super(a,b);

    }
    int add()
    {
        return x+y;
    }
}
class C extends AA
{
    C(int a,int b)
    {
        super(a,b);
    }
    int add()
    {
        return x+y;
    }
}



public class DemoAbstract {
    public static void main (String args[])
    {
        BB p=new BB(10,20);
        C q =new C(30,40);
        int ans1=p.add();
        int ans2=q.add();
        System.out.println(ans1);
        System.out.println(ans2);
    }}
