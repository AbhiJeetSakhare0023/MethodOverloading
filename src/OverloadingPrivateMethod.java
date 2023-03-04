public class OverloadingPrivateMethod {

    private static void product(int x ,int y)
    {
        System.out.println(x*y);
    }
    private static void product(double d,int i)
    {
        System.out.println(d*i);
    }
    public static void main(String[] args) {

        product(11,11);
        product(0.5d,20);

    }
}
