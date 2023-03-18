package timAssignment2;

import java.util.Scanner;

public class Main {

    static int counter = 0;
    static TimsItem[] timItem = new TimsItem[100];
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static boolean flag;

    public static void main(String[] args) {
        int item;

        for (int i = 0; i < timItem.length; i++) {

            do {
                System.out.println("1 - Tim Merchandise\n2 - Tim Consumables\n3 - Done Ordering");
                choice = getIntInput();
                if (choice >= 4 || choice <= 0) {
                    System.out.println("Please Enter Correct Choice!!");
                } else {
                    if (choice == 1) {
                        System.out.println("1 - Mug\n2 - Coffee Powder\n3 - Gift Card\n4 - Hockey Card");//Merchandise
                        do {
                            item = getIntInput();
                                switch (item) {
                                    case 1:
                                        timItem[i] = new Mugs();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;

                                    case 2:
                                        timItem[i] = new CoffeePowder();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;

                                    case 3:
                                        timItem[i] = new GiftCards();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;
                                    case 4:
                                        timItem[i] = new HockeyCards();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;
                                    default:
                                        System.out.println("Please enter correct input");
                                }
                                if(flag){
                                break;}

                        } while (item >= 5 || item <= 0 );
                    } else if (choice == 2) {
                        System.out.println("1 - Donut\n2 - Bagel\n3 - Coffee\n4 - Wrap\n5 - Sandwich");
                        do {
                            item = getIntInput();
                                switch (item) {
                                    case 1:
                                        timItem[i] = new Donut();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;
                                    case 2:
                                        timItem[i] = new Bagel();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;
                                    case 3:
                                        timItem[i] = new Coffee();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;
                                    case 4:
                                        timItem[i] = new Wrap();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;
                                    case 5:
                                        timItem[i] = new Sandwich();
                                        System.out.println(timItem[i].toString());
                                        createItem();
                                        break;
                                    default:
                                        System.out.println("Please enter correct input");
                                }
                                if(flag){
                                break;}

                        } while (item >= 6 || item <= 0 );
                    }else {
                        break;
                    }
                }
            } while (choice >= 4 || choice <= 0 || timItem[i] == null);

            if (choice == 3) {
                break;
            }
        }

        double total = 0;
        System.out.println("\n*************************************");
        System.out.println("Total Items Ordered: " + counter);
        System.out.println("*************************************\n");
        for (int i = 0; i < counter; i++) {
            total = total + timItem[i].getPrice();
            System.out.println("Item : " + timItem[i].getName() + " " + "Price : " + timItem[i].getPrice() + "$");
        }
        System.out.printf("\n*************************************\n" +
                "Total : %.2f", total);
        System.out.print("$\n" + "Proceeding Payment");

    }

    private static int getIntInput(){
        while (!sc.hasNextInt()) {
            System.out.println("**Please give integer input.**");
            sc.next();
        }
        choice= sc.nextInt();
        return choice;
    }
    private static void createItem(){
        int choices;
        System.out.println("  1. Order This\n  2. Choose Again");
        do {
            choices = getIntInput();
            if (choices == 1) {
                flag=false;
                counter++;
            } else if (choices <= 0 || choices >= 3) {
                System.out.println("Please provide correct Option.");
            } else {
                timItem[counter] = null;
                flag=true;
            }
        } while (choices <= 0 || choices >= 3);
    }
}
