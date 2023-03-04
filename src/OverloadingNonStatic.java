public class OverloadingNonStatic {
    public void sub(int x,int y)
    {
        System.out.println(x-y);
    }
    public void sub(double d1,double d2)
    {
        System.out.println(d1-d2);
    }
    public static void main(String[] args) {
        OverloadingNonStatic o1 = new OverloadingNonStatic();
        o1.sub(20,10);
        o1.sub(50.50d,10.10d);

    }
}
