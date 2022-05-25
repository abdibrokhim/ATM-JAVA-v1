package com.abdibrokhim;

import java.io.IOException;

import static com.abdibrokhim.Main.sc;

public class Menu {

    public static void mainMenu() throws IOException {

        System.out.println("\nChoose an option");
        System.out.println("[1] -> PIN");
        System.out.println("[2] -> SMS");
        System.out.println("[3] -> Balance");
        System.out.println("[4] -> Withdraw");
        System.out.println("[5] -> Exit");
        System.out.print("\n[?] -> ");

        option();
    }

    public static void option() throws IOException {
        int option = sc.nextInt();

        switch (option) {
            case 1 -> Pin.changePin();
//            case 2 -> connectSms();
//            case 3 -> showBalance();
            case 4 -> Withdraw.withdrawCash();
//            case 5 -> exit();
            default -> System.out.println("\nInvalid Choice");
        }
    }
}