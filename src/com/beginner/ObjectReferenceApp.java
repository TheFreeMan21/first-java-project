package com.beginner;

public class ObjectReferenceApp {

    public static void main(String[] args) {

        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 232422252235L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.23252524623265234;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 392");

        System.out.println("Number of seats: "+numberOfSeats);
        System.out.println("Horsepower: "+horsePower);
        System.out.println("Price: $"+price.floatValue());
        System.out.println("Registration number: "+registrationNumber);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined);
        System.out.println("Combined fuel consumption: " + fuelConsumptionPrecise.intValue());
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);

        System.out.println("The car model: " + carModel);
        System.out.println("The car model upper case: " + carModel.toUpperCase());
        System.out.println("The car model lower case: " + carModel.toLowerCase());
        System.out.println("Car model and car model with new keyword are equals: " + carModel.equals(carModelNew));
        System.out.println("The car model with new keyword: " + carModelNew);

    }

}
