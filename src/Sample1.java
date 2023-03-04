public class Sample1 {

    public static void add()
    {
        System.out.println(11+12);// 23
    }
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void add(double a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        int x=10;
        int y=20;
        double z=33;
        add();
        add(x,y);
        add(z,x);
    }

}
