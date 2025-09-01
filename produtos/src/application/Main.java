package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product x, y;
        x = new Product();
        y = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        x.name = sc.next();
        System.out.print("Price: ");
        x.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        x.quantity = sc.nextInt();







        sc.close();
    }
}
