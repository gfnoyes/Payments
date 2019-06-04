package edu.cscc;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main<monthlyPayment> {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //declare variables
        double principal;
        double rate;
        int days;
        double monthlyPayment;

        //initialization of variables;
        monthlyPayment = 0;

        System.out.println("Enter the principal balance $");
        principal = input.nextDouble();

        System.out.println("Enter the annual interest rate:");
        rate = input.nextDouble();

        System.out.println("Enter the number of days in the billing cycle:");
        days = input.nextInt();

        //calculate the monthly payment amount
        monthlyPayment = ((principal * (rate / 100)) / 365) * days;

        DecimalFormat roundCurrency = new DecimalFormat("0.00");

        System.out.println("The approximate monthly payment amount is $" + roundCurrency.format(monthlyPayment));
    }
}

