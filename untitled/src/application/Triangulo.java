package application;

import Entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.printf("Enter the measures of triangle X: %n");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("Enter the measures of triangle Y: %n");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        char largTri;
        if (areaX > areaY) {
            largTri = 'X';
        } else {
            largTri = 'Y';
        }

        System.out.printf("Larger area: %c%n", largTri);

        sc.close();
    }
}