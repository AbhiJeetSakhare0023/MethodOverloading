public class OverloadingMainMethod {
    public static void main() // main method overloading
    {
        int x=10;
        int y=20;
        System.out.println(x+y);
    }
    public static void main(String[] args) {

        double a=33.33d;
        double b=44.44d;

        System.out.println(a+b);

        main();

    }
}
