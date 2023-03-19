public class FunctionApp {

    public static void main(String[] args) {

        sayHello();
        blackboardPunishment(5);
        System.out.println();
        System.out.println(getTenPercentOffDiscountPrice(20000));
        System.out.println();
        System.out.println(getDiscountPrice1(100,23));
        System.out.println();
        System.out.println(getDiscountPrice2(277,44));

    }

    static void sayHello(){
        System.out.println("Hello!!!");
    }

    static void blackboardPunishment(int repeatNumber){
        for (int i =1;i<=repeatNumber;i++){
            System.out.println("Yes yes yes yes");
        }
    }

    static double getTenPercentOffDiscountPrice(int price){
        return price * 0.9;
    }

    static double getDiscountPrice1(int price, int percent){
        return price*percent/100.0;
    }

    static double getDiscountPrice2(double price,int percent){
        return price*percent/100;
    }

}
