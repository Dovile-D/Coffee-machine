package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 200;
        int milk = 50;
        int coffee = 15;

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
//
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cups = scanner.nextInt();
//        System.out.println("For " + cups + " cups of coffee you will need:");
//        System.out.println(cups * water + " ml of water");
//        System.out.println(cups * milk + " ml of milk");
//        System.out.println(cups * coffee + " g of coffee beans");

        System.out.println("Write how many ml of water the coffee machine has:");
        int currentWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int currentMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int currentCoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int waterFullCups = currentWater / water;
        int milkFullCups = currentMilk / milk;
        int coffeeFullCups = currentCoffee / coffee;

//        finding a min value of 3 parameters to know max possible coffee cups
        int maxCups = Math.min(Math.min(waterFullCups, milkFullCups), coffeeFullCups);

        if (maxCups == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (maxCups > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCups- cups) + " more than that)");
        }
        else if (maxCups < cups) {
            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
        }



    }

}
