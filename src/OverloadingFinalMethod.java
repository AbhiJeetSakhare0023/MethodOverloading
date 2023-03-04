public class OverloadingFinalMethod {
    final static void div(int x,int y)
    {
        System.out.println(x/y);
    }
    final static void div(double d,int i)
    {
        System.out.println(d/i);
    }
    public static void main(String[] args) {

        div(10,5);
        div(20.20,5);

    }
}
