import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter=0;
        TimsItem[] timItem = new TimsItem[100];
        Scanner sc = new Scanner(System.in);
        int choice;
        int choice2;
        int merch;
        int consumable;
        for (int i =0; i< timItem.length; i++){

            do{
                System.out.println("1 - Tim Merchandise\n2 - Tim Consumables\n3 - Done Ordering");
                choice = sc.nextInt();
                if (choice>=4 || choice <= 0){
                    System.out.println("Please Enter Correct Choice!!");
                }else {
                    switch (choice) {
                        case 1:            //Merchandise

                            do{
                                System.out.println("1 - Mug\n2 - Coffee Powder\n3 - Gift Card\n4 - Hockey Card");
                                merch = sc.nextInt();
                                if (merch>=5 || merch <= 0){
                                    System.out.println("Please Enter Correct Choice!!");
                                }else {
                                    switch (merch) {
                                        case 1:
                                            timItem[i] = new Mugs();
                                            System.out.println(timItem[i].toString());
                                            do {

                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new Mugs();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2 >= 3);
                                            break;

                                        case 2:
                                            timItem[i] = new CoffeePowder();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new CoffeePowder();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2 >= 3);
                                            break;

                                        case 3:
                                            timItem[i] = new GiftCards();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new GiftCards();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2 >= 3);
                                            break;
                                        case 4:
                                            timItem[i] = new HockeyCards();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new HockeyCards();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2>= 3);
                                            break;
                                    }
                                }

                            }while (merch >=5 || merch<=0 || timItem[i] == null);
                            break;
                        case 2:

                            do{
                                System.out.println("1 - Donut\n2 - Bagel\n3 - Coffee\n4 - Wrap\n5 - Sandwich");
                                consumable = sc.nextInt();
                                if (consumable>=6 || consumable <= 0){
                                    System.out.println("Please Enter Correct Choice!!");
                                }else {
                                    switch (consumable) {
                                        case 1:
                                            timItem[i] = new Donut();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new Donut();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2>= 3);
                                            break;
                                        case 2:
                                            timItem[i] = new Bagel();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new Bagel();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2 >= 3);
                                            break;
                                        case 3:
                                            timItem[i] = new Coffee();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new Coffee();
                                                    counter++;
                                                } else if(choice2<=0 || choice2>= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2 >= 3);
                                            break;
                                        case 4:
                                            timItem[i] = new Wrap();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new Wrap();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2>= 3);
                                            break;
                                        case 5:
                                            timItem[i] = new Sandwich();
                                            System.out.println(timItem[i].toString());
                                            do {
                                                System.out.println("  1. Order This\n  2. Choose Again");
                                                choice2 = sc.nextInt();
                                                if (choice2 == 1) {
                                                    timItem[i] = new Sandwich();
                                                    counter++;
                                                } else if(choice2<=0 || choice2 >= 3){
                                                    System.out.println("Please provide correct Option.");
                                                }
                                                else {
                                                    timItem[i] = null;
                                                }
                                            }while(choice2<=0 || choice2 >= 3);
                                            break;
                                    }
                                }

                            }while (consumable >=6 || consumable<=0 || timItem[i]== null);
                            break;
                        case 3:
                        break;

                    }
                }
            }while (choice >=4 || choice<=0 );

                if(choice == 3){
                    break;
                }

        }
        double total=0;
        System.out.println("\n*************************************");
        System.out.println("Total Items Ordered: "+ counter);
        System.out.println("*************************************\n");
        for (int i =0; i<counter;i++){
            total = total + timItem[i].getPrice();

            if(timItem[i] instanceof Mugs){
                System.out.println("Item : Mug                     "+"Price : "+timItem[i].getPrice()+"$");
            } else if (timItem[i] instanceof Bagel) {
                System.out.println("Item : Bagel                   "+"Price : "+timItem[i].getPrice()+"$");
            }else if (timItem[i] instanceof Coffee) {
                System.out.println("Item : Coffee                  "+"Price : "+timItem[i].getPrice()+"$");
            }else if (timItem[i] instanceof CoffeePowder) {
                System.out.println("Item : Coffee Powder           "+"Price : "+timItem[i].getPrice()+"$");
            }else if (timItem[i] instanceof Sandwich) {
                System.out.println("Item : Sandwich                "+"Price : "+timItem[i].getPrice()+"$");
            }else if (timItem[i] instanceof Wrap) {
                System.out.println("Item : Wrap                    "+"Price : "+timItem[i].getPrice()+"$");
            }else if (timItem[i] instanceof HockeyCards) {
                System.out.println("Item : Hockey Card             "+"Price : "+timItem[i].getPrice()+"$");
            }else if (timItem[i] instanceof GiftCards) {
                System.out.println("Item : Gift Card               "+"Price : "+timItem[i].getPrice()+"$");
            }else if (timItem[i] instanceof Donut) {
                System.out.println("Item : Donut                   "+"Price : "+timItem[i].getPrice()+"$");
            }

        }
        System.out.printf("\n*************************************\n" +
                "Total : %.2f", total);
        System.out.print("$\n"+ "Proceeding Payment");

    }
}