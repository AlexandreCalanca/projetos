package main;

import entities.Athletes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int n = sc.nextInt();

        List<Athletes> athletes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Sexo: ");
            char gender = sc.next().charAt(0);
            while (gender != 'M' && gender != 'F') {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                gender = sc.next().charAt(0);
            }
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                height = sc.nextDouble();
            }
            System.out.print("Peso: ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                weight = sc.nextDouble();
            }
            athletes.add(new Athletes(name, gender, height, weight));
        }

        Double averageWeight = athletes.stream()
                .mapToDouble(Athletes::getWeight)
                .average()
                .orElse(0.0);

        String tallestAthlete = athletes.stream()
                .max((a1, a2) -> a1.getHeight().compareTo(a2.getHeight()))
                .map(Athletes::getName)
                .orElse("Ninguém");

        long countMen = athletes.stream()
                .filter(a -> a.getGender() == 'M')
                .count();
        Double percentageOfMen = (n > 0) ? (countMen * 100.0) / n : 0.0;

        Double averageFemaleHeight = athletes.stream()
                .filter(a -> a.getGender() == 'F')
                .mapToDouble(Athletes::getHeight)
                .average()
                .orElse(0.0);

        System.out.println("RELATÓRIO: ");
        System.out.printf("Peso médio dos atletas: %.2f%n", averageWeight);
        System.out.printf("Atleta mais alto: %s%n", tallestAthlete);
        System.out.printf("Porcentagens de homens: %.2f%n", percentageOfMen);
        System.out.printf("Altura média das mulheres: %.2f%n", averageFemaleHeight);
        sc.close();
    }
}
