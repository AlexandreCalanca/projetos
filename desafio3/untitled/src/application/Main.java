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

        List<Bill> bill = new ArrayList<>();

        System.out.print("Sexo: ");
        Character gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        Integer quantBeer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        Integer quantSoftDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        Integer quantBarbecue = sc.nextInt();

        bill.add(new Bill(gender, quantBeer, quantSoftDrink, quantBarbecue));

        sc.close();
    }
}