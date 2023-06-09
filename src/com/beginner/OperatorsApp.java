package com.beginner;

public class OperatorsApp {

    public static void main(String[] args) {

        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": $ "  + price);

        int increasedPrice = price + 1000;
        System.out.println("The increased price of a " + carModel + ": $"  + increasedPrice);

        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a " + carModel + ": $ " + decreasedPrice);

        int twoCarsPrice = price*2;
        System.out.println("Two " + carModel + ": $ " + twoCarsPrice);

        int dodgesYouCanBuy = moneyInTheBank/price;
        System.out.println("From the money we have in the bank we can buy " + dodgesYouCanBuy + " " + carModel);

        int moneyRemaining = moneyInTheBank%price;
        System.out.println("money we would remain after buying " + dodgesYouCanBuy + " "+ carModel + ": $" + moneyRemaining);

        System.out.println();


        int priceNegative = -14999;
        int priceNegativeWithPlusSign = + priceNegative;
        System.out.println("Negative with plus sign: $"  + priceNegativeWithPlusSign);

        int priceNegativeWithMinusSign = - priceNegative;
        System.out.println("Negative with minus sign: $ " + priceNegativeWithMinusSign);

        int priceOneDollarIncrease = ++price;
        System.out.println("Price after one dollar increase: $ "+priceOneDollarIncrease);

        int priceOneDollarDecrease = --price;
        System.out.println("Price after one dollar decrease: $ "+priceOneDollarDecrease);


        System.out.println("This car is damaged: " + !isDamaged);

        System.out.println();

        System.out.println("Car's price equals the money in the bank: " + (price==moneyInTheBank));
        System.out.println("Car's price doesn't equal the money in the bank: " + (price!=moneyInTheBank));
        System.out.println("Car's price is greater then the money in the bank: " + (price>moneyInTheBank));
        System.out.println("Car's price lower than the money in the bank: " + (price<moneyInTheBank));
        System.out.println("Car's price is greater then or equals the money in the bank: " + (price>=moneyInTheBank));
        System.out.println("Car's price lower than or equals the money in the bank: " + (price<=moneyInTheBank));
        System.out.println("The carModel variable's datatype is a String: " + (carModel instanceof String));
        System.out.println();

        String damagedText = isDamaged ? "The car is damaged":"The car is not damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingText = !isDamaged || price<=20000 ? "It's worth seeing the car":"It isn't worth to see the car";
        System.out.println(worthSeeingText);

        String worthRepairingText = isDamaged && price <= 10000 ? "It's worth repairing the car":"It isn't worth to repair the car";
        System.out.println(worthRepairingText);
        System.out.println();

        price += 1000;
        System.out.println("Price increased: $" + price);
        price -= 2000;
        System.out.println("Price decreased: $" + price);
        price *= 2;
        System.out.println("Price multiplied: $" + price);
        price /= 2;
        System.out.println("Price divided: $" + price);
        price %= 10000;
        System.out.println("Price remained: $" + price);

    }

}
