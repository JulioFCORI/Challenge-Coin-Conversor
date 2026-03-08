package com.miapi;

import java.util.Currency;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        CurrencyConsult consultor = new CurrencyConsult();
        consultor.lookupRate("USD");
        while (option != 0) {
            System.out.println(
                    """
                                ************************************
                                Welcome to Coin-Convesor version 0.1
                                Please enter the option that complains you.
                                1) Dolar =>> Argentine peso
                                2) Argentine peso =>> Dolar
                                3) Dolar =>> Brazilian real
                                4) Brazilian real =>> Dolar
                                5) Dolar =>> Colombian peso
                                6) Colombian peso =>> Dolar
                                7) Dolar =>> Mexican Peso
                                8)Mexican Peso =>> Dolar
                                0) Exit
                                ************************************
                            """);
            option = scanner.nextInt();
            switch (option) {
                case 1:

                    System.out.println("Hello I am option number" + option);
                    break;

                case 2:
                    System.out.println("Hello I am option number" + option);

                    break;

                case 3:
                    System.out.println("Hello I am option number" + option);

                    break;

                case 4:
                    System.out.println("Hello I am option number" + option);

                    break;

                case 5:
                    System.out.println("Hello I am option number" + option);

                    break;

                case 6:
                    System.out.println("Hello I am option number" + option);

                    break;

                case 7:
                    System.out.println("Hello I am option number" + option);

                    break;

                case 8:
                    System.out.println("Hello I am option number" + option);

                    break;

                case 0:
                    System.out.println("Good bye");

                    break;

                default:
                    System.out.print("The option is not valid");
                    break;
            }
        }

    }
}
