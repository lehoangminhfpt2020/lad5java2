package java2.lad5.baitap2.GiftView;

import java2.lad5.baitap2.GiftController.GiftController;

import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        GiftController g1 = new GiftController();
        boolean exit = false;
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (!exit){
            System.out.println("\nGIFT SHOP\n");
            System.out.println("---------------");
            System.out.println("1- View All gift\n" +
                    "2- Add gift\n" +
                    "3- Delete gift\n" +
                    "4- Exit");
            System.out.printf("Enter Your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    g1.selectGift();
                    break;
                case 2:
                    g1.insertGift();
                    break;
                case 3:
                    g1.deleteGift();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
