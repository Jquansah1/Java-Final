package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int snack;
        String name;
        String customerName;
        String validation;
        String storeOpen;
        boolean close = false;
        receipt r = new receipt ();
        item [] snacks = new item [10];
        item item1 = new item ();
        item item2 = new item ();
        item item3 = new item ();
        item item4 = new item ();
        item item5 = new item ();
        item item6= new item ();
        item item7 = new item ();
        item item8 = new item ();
        item item9 = new item ();
        item item10 = new item ();
        item1.itemName = "Red-Hot Spicy Doritos";
        item1.itemPrice = 2.99;
        snacks[0] = item1;
        item2.itemName = "Cool Ranch Doritos";
        item2.itemPrice = 2.99;
        snacks[1] = item2;
        item3.itemName = "Coke";
        item3.itemPrice = .99;
        snacks[2] = item3;
        item4.itemName = "Diet Coke";
        item4.itemPrice = .99;
        snacks[3] = item4;
        item5.itemName = "Pepsi";
        item5.itemPrice = .99;
        snacks[4] = item5;
        item6.itemName = "5 Hour Energy";
        item6.itemPrice = 3.99;
        snacks[5] = item6;
        item7.itemName = "Sunflower Seeds";
        item7.itemPrice = .99;
        snacks[6] = item7;
        item8.itemName = "Peanuts";
        item8.itemPrice = .99;
        snacks[7] = item8;
        item9.itemName = "MacBook Charger";
        item9.itemPrice = 120.00;
        snacks[8] = item9;
        item10.itemName = "Dell Charger";
        item10.itemPrice = 50.00;
        snacks[9] = item10;
        System.out.println("Items for Sale");
        System.out.println("---------------");
        for (int i = 0; i < snacks.length;i++) {
            int itemnum = i+1;
            System.out.println("( "+itemnum +" ) "+snacks[i].itemName+" -- "+snacks[i].itemPrice);
        }
        System.out.println("====================================================================================================================================");
        System.out.println("!!!DISCLAIMER: When answering yes and no questions only enter a single character 'y' "
                + "for YES or single character 'n' for NO");
        System.out.println("====================================================================================================================================");
        while (close==false) {
            System.out.print("Enter CUSTOMER NAME to purchase items: ");
            customerName = input.next();
            System.out.print(customerName+" would you like to purchase an item (y/n): ");
            validation = input.next();
            while (validation.equals("y")|| validation.equals("Y")) {

                System.out.print("Enter Item Number from list: ");
                snack = input.nextInt();
                while(snack > 10 || snack < 1) {
                    System.out.print("ERROR!!!Enter Number Corresponding to Item You'd Like to purchase from list: ");
                    snack = input.nextInt();
                }
                name = snacks[snack-1].itemName;
                for (int i = 0; i < snacks.length; i++) {
                    if (name.equals(snacks[i].itemName)) {
                        r.addItem(snacks[i]);
                        System.out.println("Purchased -> "+snacks[i].itemName);
                    }

                }
                System.out.print("Purchase another item (y/n): ");
                validation = input.next();
            }
            System.out.print("New Customer? (y/n): ");
            storeOpen= input.next();
            System.out.println("-------------------------------------------------");
            if (storeOpen.equals("n")|| storeOpen.equals("N")) {
                System.out.println("END OF DAY RECEIPT: Total Sales");
                System.out.println("=================================");
                r.displayItems();
                System.out.println("-------------------------------------------------");
                System.out.print("Total Sales: $");
                System.out.printf("%.2f",r.getTotal());
                close = true;
            }

        }



    }


}

