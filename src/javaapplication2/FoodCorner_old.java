package javaapplication2;


import java.util.Scanner;

public class FoodCorner_old {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Scanner NumScanner = new Scanner(System.in);
        System.out.println("***~Welcome to Western Food Corner~***");

        double total = 0;

        // starter prices: declare variable an assign values
        double FrenchFries = 4.00;
        double MacCheese = 4.50;
        double Coleslaw = 3.00;

        // main meal prices
        double Steak = 15.00;
        double FishChips = 10.50;
        double ChickenChop = 12.00;

        // dessert prices
        double Waffles = 6.00;
        double Pancakes = 7.00;
        double IceCream = 1.00;
        
        // true if user has selected Exit Option
        boolean IsESelected = false;

        // variable to allow user to select choice from the menu;
        char choice;
        //double total;

        
        
        //oop from here so that this is printed on the screen continuously
        do {
            System.out.println("---------------------------------------------");
            System.out.println("    Select from the choice below    ");
            System.out.println("---------------------------------------------");
            System.out.println("    Code  |     Description");
            System.out.println("---------------------------------------------");
            System.out.println("| S        | Starter                      |");
            System.out.println("| M        | Main                         |");
            System.out.println("| D        | Dessert                      |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| E        |           EXIT               |");
            System.out.println("|-----------------------------------------|");

            System.out.println();
            System.out.println("Enter Choice");

            // user choice here
                choice = kb.next().charAt(0);

            // switch statement to allow user to select type of meal
            switch (choice) {
                case 'S':
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

                        System.out.println("Enter quantity");

                        // user choice here
                        choice = kb.next().charAt(0);

                        // user quantity here
                        total = NumScanner.nextInt();

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
                                System.out.println("Return Selected");
                                break;
                                
                            case 'E':
                                System.out.println("EXITING SYSTEM");
                                choice='R';
                                IsESelected=true;
                                break;

                            // invalid entry or caps lock is off
                            default:
                                System.out.println("Invalid selection or check caps lock is on");

                        }

                        //break;
                    } while (choice != 'R' );

                    // breaking here because we just deal with our 1st case
                    break;

                // second case here which is the main
                case 'M':
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
                        System.out.println("Enter quantity: ");

                        // user choice here
                        choice = kb.next().charAt(0);
                        // user quantity here
                        total = NumScanner.nextInt();


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
                            case 'R':
                                System.out.println("Return Selected");
                                break;
                            case 'E':
                                System.out.println("EXITING SYSTEM");
                                choice='R';
                                IsESelected=true;
                                break;

                            default:
                                System.out.println("Invalid selection or check caps lock is on");

                        }

                    } while (choice != 'R' );

                    // break here:end of main meals switch statement;
                    break;
                case 'D':
                    do {
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
                        System.out.println("Enter quantity: ");

                        //user choice here
                        choice = kb.next().charAt(0);
                        //user quantity here
                        total = NumScanner.nextInt();

                        switch(choice) {
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
                                System.out.println("Return Selected");
                                break;
                            case 'E':
                                System.out.println("EXITING SYSTEM");
                                choice='R';
                                IsESelected=true;
                                break;

                            default:
                                System.out.println("Invalid selection or check caps lock is on");

                        }

                    }  while (choice != 'R');

                // break here:end of main meals switch statement;
                break;

                default:System.out.println("Invalid selection or check caps lock is on"); }
               
            if(IsESelected==true)
                choice='E';
        }while(choice!='E');

        System.out.println("Total bill to pay RM "+total);
        System.out.println("THANK YOU FOR YOUR ORDER");
    }
}