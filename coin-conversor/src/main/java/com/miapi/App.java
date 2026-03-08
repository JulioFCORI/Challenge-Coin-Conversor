package com.miapi;

import java.util.Currency;
import java.util.Scanner;

public class App {
    public static void converter(String fcoinBase, String scoinBase ){
        Scanner scanner = new Scanner(System.in);
        double numberConvert = 0;
        System.out.println("Please enter the quantity that you want to convert into " + scoinBase);
        numberConvert = scanner.nextDouble();
        CurrencyConsult consultor = new CurrencyConsult();
        Double rate = consultor.lookupRate(fcoinBase).conversion_rates().get(scoinBase);

        double result = numberConvert*rate;
        System.out.println("The converter value from "+ fcoinBase + " to " + scoinBase + " of " + numberConvert + " is " + result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        CurrencyConsult consultor = new CurrencyConsult();
        CurrencyData answer = consultor.lookupRate("USD");
        answer.conversion_rates().forEach((moneda, valor) -> {
            System.out.println(moneda + " " + valor);
        });
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
                    converter("USD","ARS");

                    //System.out.println("Hello I am option number" + option);
                    break;

                case 2:
                    converter("ARS","USD");
                    //System.out.println("Hello I am option number" + option);
                    break;

                case 3:
                    converter("USD","BRL");
                    //System.out.println("Hello I am option number" + option);

                    break;

                case 4:
                    converter("BRL","USD");
                    //System.out.println("Hello I am option number" + option);

                    break;

                case 5:
                    converter("USD","COP");
                    //System.out.println("Hello I am option number" + option);

                    break;

                case 6:
                    converter("COP","USD");
                    //System.out.println("Hello I am option number" + option);

                    break;

                case 7:
                    converter("USD","MXN");
                    //System.out.println("Hello I am option number" + option);

                    break;

                case 8:
                    converter("MXN","USD");
                    //System.out.println("Hello I am option number" + option);

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
