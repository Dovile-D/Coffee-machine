package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    private String state;

    public CoffeeMachine() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;

        this.state = "choosing an action";
    }

    public void processInput(String input) {
        Scanner scanner = new Scanner(input);

        switch (state) {
            case "choosing an action":
                switch (scanner.next()) {
                    case "buy":
                        state = "choosing a type of coffee";
                        break;
                    case "fill":
                        state = "filling water";
                        break;
                    case "take":
                        takeMoney();
                        break;
                    case "remaining":
                        printStatus();
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        break;
                }
                break;
            case "choosing a type of coffee":
                switch (scanner.next()) {
                    case "1":
                        makeCoffee(250, 0, 16, 4);
                        break;
                    case "2":
                        makeCoffee(350, 75, 20, 7);
                        break;
                    case "3":
                        makeCoffee(200, 100, 12, 6);
                        break;
                    case "back":
                        break;
                    default:
                        break;
                }
                state = "choosing an action";
                break;
            case "filling water":
                water += scanner.nextInt();
                state = "filling milk";
                break;
            case "filling milk":
                milk += scanner.nextInt();
                state = "filling beans";
                break;
            case "filling beans":
                beans += scanner.nextInt();
                state = "filling cups";
                break;
            case "filling cups":
                cups += scanner.nextInt();
                state = "choosing an action";
                break;
            default:
                break;
        }

        scanner.close();
    }

    private void makeCoffee(int waterNeeded, int milkNeeded, int beansNeeded, int cost) {
        if (water >= waterNeeded && milk >= milkNeeded && beans >= beansNeeded && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterNeeded;
            milk -= milkNeeded;
            beans -= beansNeeded;
            cups -= 1;
            money += cost;
        } else {
            if (water < waterNeeded) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < milkNeeded) {
                System.out.println("Sorry, not enough milk!");
            } else if (beans < beansNeeded) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    private void takeMoney() {
        System.out.printf("I gave you $%d\n", money);
        money = 0;
    }

    private void printStatus() {
        System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money\n",
                water, milk, beans, cups, money);
    }


    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            machine.processInput(input);
        }
    }
}