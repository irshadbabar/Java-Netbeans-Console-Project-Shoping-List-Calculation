package javaapplication2;

import java.util.Scanner;

public class FoodCorner {

    private char choice;

    public void getNewChoice() {
        choice = getScanner().next().charAt(0);
    }

    public Scanner getScanner() {
        Scanner kb = new Scanner(System.in);
        return kb;
    }

    public void MainMenu() {
        
        do{
            
        
        double FrenchFries = 4.00;
        double MacCheese = 4.50;
        double Coleslaw = 3.00;

        // main meal prices
        double Steak = 15.00;
        double FishChips = 10.50;
        double ChickenChop = 12.00;

        // dessert prices
        double Waffles  = 6.00;
        double Pancakes = 7.00;
        double IceCream = 1.00;

        System.out.println("-------------------------------------------");
        System.out.println("    Select from the choice below    ");
        System.out.println("-------------------------------------------");
        System.out.println("    Code  |     Description");
        System.out.println("-------------------------------------------");
        System.out.println("| S        | Starter                      |");
        System.out.println("| M        | Main                         |");
        System.out.println("| D        | Dessert                      |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| E        |           EXIT               |");
        System.out.println("|-----------------------------------------|");

        System.out.println();
        System.out.println("Enter Choice");

        // user choice here
        getNewChoice();

        switch (choice) {
            case 'S':ShowStarterChoice(FishChips, MacCheese, Coleslaw);
                break;
            case 'M':ShowMainChoice(Steak, FishChips, ChickenChop);
                break;
            case 'D':ShowDessertChoice(Pancakes, Waffles, IceCream);
                break;
            case 'E':System.out.println("EXITING SYSTEM");
                System.exit(0);
                    
                break;
            default:System.out.println("Invalid selection or check caps lock is on");
                break;

        }
        }while(true);

    }

    public void ShowStarterChoice(double FrenchFries, double MacCheese, double Coleslaw) {

        

        do {
            System.out.println("|-----------------------------------------|");
            System.out.println("|   Select starter from the choices below |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| Code     |         Description          |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| F       | French Fries              $4.00   |");
            System.out.println("| M       | Mac and Cheese              $4.50   |");
            System.out.println("| C        | Coleslaw           $3.00   |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| R        |           RETURN             |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| E        |            EXIT              |");
            System.out.println("|-----------------------------------------|");
            System.out.println();
            System.out.println("Enter choice");
            
            getNewChoice();
            
            System.out.println("Enter quantity");

            // user choice here
            

            // user quantity here
            double total = getScanner().nextInt();

            switch (choice) {
                case 'F':
                    System.out.println("French Fries selected");
                    // remember that total was initialized from zero
                    total = total * FrenchFries;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");
                    break;

                case 'M':
                    System.out.println("Mac and Cheese selected");
                    total = total * MacCheese;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");

                    break;

                case 'C':
                    System.out.println("Coleslaw selected");
                    total = total * Coleslaw;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");
                    break;

                // return program to 1st screen
                case 'R':
                    MainMenu();
                    break;

                case 'E':
                    System.out.println("EXITING SYSTEM...");
                    System.exit(0);
                    break;

                // invalid entry or caps lock is off
                default:
                    System.out.println("Invalid selection or check caps lock is on");

            }

            //break;
        } while (choice != 'R');

    }

    public void ShowMainChoice(double Steak, double FishChips, double ChickenChop) {

        

        // switch statement to allow user to select type of meal
        do {
            System.out.println("|-----------------------------------------|");
            System.out.println("| Select main meal from the choices below |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| Code     |         Description          |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| S        | Steak          $15.00    |");
            System.out.println("| F        | Fish and Chips    $10.50    |");
            System.out.println("| C        | Chicken Chop       $12.00    |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| R        |           RETURN             |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| E        |            EXIT              |");
            System.out.println("|-----------------------------------------|");
            System.out.println();

            System.out.println("Enter choice: ");
            getNewChoice();

            System.out.println("Enter quantity: ");
            double total = getScanner().nextDouble();

            switch (choice) {

                case 'S':

                    System.out.println("Steak selected");
                    total = total * Steak;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");
                    break;

                case 'F':
                    System.out.println("Fish and Chips Selected");
                    total = total * FishChips;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");
                    break;

                case 'C':
                    System.out.println("Chicken Chop Selected");
                    total = total * ChickenChop;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");

                // return program to 1st screen
                case 'R':
                    MainMenu();
                    break;

                case 'E':
                    System.out.println("EXITING SYSTEM");
                    System.exit(0);
                    break;

                // invalid entry or caps lock is off
                default:
                    System.out.println("Invalid selection or check caps lock is on");

            }

            //break;
        } while (choice != 'R');

    }

    public void ShowDessertChoice(double Pancakes, double Waffles, double IceCream) {

        // switch statement to allow user to select type of meal
        do{
            System.out.print("|-----------------------------------------|");
            System.out.println("|   Select dessert from the choices below |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| Code     |         Description          |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| P        | Pancakes             $5.00   |");
            System.out.println("| W        | Waffles              $6.00  |");
            System.out.println("| I        | Ice Cream            $1.50   |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| R        |           RETURN             |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| E        |            EXIT              |");
            System.out.println("|-----------------------------------------|");
            System.out.println();
            System.out.println("Enter choice: ");
        
            //user choice here
            getNewChoice();
        
            //user quantity here
            
            System.out.println("Enter quantity: ");

            
            double total = getScanner().nextInt();

            switch (choice) {
                case 'P':
                    System.out.println("Pancakes selected");
                    total = total * Pancakes;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");
                    break;

                case 'W':
                    System.out.println("Waffles Selected");
                    total = total * Waffles;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");
                    break;

                case 'I':
                    System.out.println("Ice Cream Selected");
                    total = total * IceCream;
                    System.out.println("Your total bill is $ " + total);
                    System.out.println("Would you like to order more?");
                case 'R':
                    MainMenu();
                    break;

                case 'E':
                    System.out.println("EXITING SYSTEM");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid selection or check caps lock is on");

            }

        }
        while (choice != 'R');

        // break here:end of main meals switch statement;
    }

    public static void main(String[] args) {

        
    new FoodCorner().MainMenu();
    
    }
}
