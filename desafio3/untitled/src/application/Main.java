package application;

import entities.Bill;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Bill> bills = new ArrayList<>();

        System.out.print("Sexo: ");
        char gender = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int quantBeer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int quantSoftDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int quantBarbecue = sc.nextInt();

        bills.add(new Bill(gender, quantBeer, quantSoftDrink, quantBarbecue));



        sc.close();
    }
}