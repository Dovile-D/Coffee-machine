package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int currentWater = 0;
        int currentMilk = 0;
        int currentCoffee = 0;
        int currentMoney = 0;
        int currentCups = 0;

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

//        System.out.println("Write how many ml of water the coffee machine has:");
//        int currentWater = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int currentMilk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int currentCoffee = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cups = scanner.nextInt();

//        int waterFullCups = currentWater / water;
//        int milkFullCups = currentMilk / milk;
//        int coffeeFullCups = currentCoffee / coffee;

//        finding a min value of 3 parameters to know max possible coffee cups
//        int maxCups = Math.min(Math.min(waterFullCups, milkFullCups), coffeeFullCups);
//
//        if (maxCups == cups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        }
//        else if (maxCups > cups) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCups- cups) + " more than that)");
//        }
//        else if (maxCups < cups) {
//            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
//        }

        int water = 0;
        int coffee = 0;
        int milk = 0;
        int price = 0;
        int cups = 0;




        System.out.println("Please, choose an operation: ");
        String choice = scanner.nextLine();

            switch (choice) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    int coffeeType = scanner.nextInt();
                    switch (coffeeType) {
                        case 1:
                            water = 250;
                            coffee = 16;
                            milk = 0;
                            price = 4;
                            cups = 1;
                            break;
                        case 2:
                            water = 350;
                            milk = 75;
                            coffee = 20;
                            price = 7;
                            cups = 1;
                            break;
                        case 3:
                            water = 200;
                            milk = 100;
                            coffee = 12;
                            price = 6;
                            cups = 1;
                            break;
                    }
                    currentWater = currentWater - water;
                    currentMilk = currentMilk - milk;
                    currentCoffee = currentCoffee - coffee;
                    currentMoney = currentMoney + price;
                    currentCups = currentCups - cups;
                    break;
                case "fill":

                    break;
                case "take":
                    take();
                    break;

            }
        }


    public void printCurrentStatement(int water, int milk, int coffee, int cups, int money) {

        System.out.println("The coffee machine has:\n" +
                + water + " ml of water\n" +
                + milk + " ml of milk\n" +
                + coffee + " g of coffee beans\n" +
                + cups + " disposable cups\n" +
                + money + " of money");
    }

}
