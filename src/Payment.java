public class Payment {

    public static void payment(String type,long cardNum,int cvv)
    {
        System.out.println("BY CARD------");
        System.out.println();
        System.out.println("Card Type: "+type);
        System.out.println("CardNum: "+cardNum);
        System.out.println("CVV: "+cvv);
        System.out.println();
    }

    public static void payment(String type,long phone)
    {
        System.out.println("BY ONLINE------");
        System.out.println();
        System.out.println("Type :"+type);
        System.out.println("Phone "+phone);
        System.out.println();
    }
    public static void payment(String bname,String custName,int acNum,String IFC,double amt)
    {
        System.out.println("BY INTERNET BANKING------");
        System.out.println();
        System.out.println("BankName :"+bname);
        System.out.println("BankName :"+custName);
        System.out.println("BankName :"+acNum);
        System.out.println("BankName :"+IFC);
        System.out.println("BankName :"+amt);
        System.out.println();
    }
    public static void main(String[] args) {

        payment("BOM","Abhi",6022768,"Mahb0010",555555.55d);
        payment("Gpay",9503370023l);
        payment("CreditCard",123456789l,111);
        System.out.println("-----------Thank You--------------");
    }
}
