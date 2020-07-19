import java.util.Scanner;

public class CoffeeMachine {

    int moneyz;
    int cups;
    int coffee;
    int milk;
    int water;
    String missing;


    public CoffeeMachine(int moneyz, int cups, int coffee, int milk, int water) {
        this.moneyz = moneyz;
        this.cups = cups;
        this.coffee = coffee;
        this.milk = milk;
        this.water = water;
    }


    public int getMoneyz() {
        return moneyz;
    }

    public void setMoneyz(int moneyz) {
        this.moneyz = moneyz;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void getRemaining () {
        System.out.println("");
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + moneyz + " of money");
        System.out.println("");
    }

    public void getTake () {
        System.out.println("I gave you $" + moneyz);
        System.out.println("");
        setMoneyz(0);
    }

    public void getBuy () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = scanner.nextLine();

        switch (type) {
            case "1":
                if (water >= 250 && coffee >= 16 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    water = water - 250;
                    coffee = coffee - 16;
                    cups = cups - 1;
                    moneyz = moneyz + 4;
                } else {
                    if (water < 250) {
                        missing = "water";
                    } else if (coffee < 16) {
                        missing = "coffee";
                    } else if (cups < 1) {
                        missing = "cups";
                    }
                    System.out.printf("Sorry, not enough %s!\n\n", missing);
                }

                break;
            case "2":
                if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    water = water - 350;
                    milk = milk - 75;
                    coffee = coffee - 20;
                    cups = cups - 1;
                    moneyz = moneyz + 7;
                } else {
                    if (water < 250) {
                        missing = "water";
                    } else if (milk < 75) {
                        missing = "milk";
                    } else if (coffee < 16) {
                        missing = "coffee";
                    } else if (cups < 1) {
                        missing = "cups";
                    }
                    System.out.printf("Sorry, not enough %s!\n\n", missing);
                }


                break;
            case "3":
                if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    water = water - 200;
                    milk = milk - 100;
                    coffee = coffee - 12;
                    cups = cups - 1;
                    moneyz = moneyz + 6;
                } else {
                    if (water < 250) {
                        missing = "water";
                    } else if (milk < 75) {
                        missing = "milk";
                    } else if (coffee < 16) {
                        missing = "coffee";
                    } else if (cups < 1) {
                        missing = "cups";
                    }
                    System.out.printf("Sorry, not enough %s!\n\n", missing);
                }


                break;
            case "back":
                break;

        }
    }

    public void getFill () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        setWater(getWater() + scan.nextInt());
        System.out.println("Write how many ml of milk do you want to add:");
        setMilk(getMilk() + scan.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        setCoffee(getCoffee() + scan.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        setCups(getCups() + scan.nextInt());
        scan.nextLine(); //catch me some buffers~!!!11445
    }

    public void actions (String action) {
        switch (action) {
            case "remaining":
                getRemaining();
                break;
            case "take":
                getTake();
                break;
            case "fill":
                getFill();
                break;
            case "buy":
                getBuy();
                break;
        }
    }



}
