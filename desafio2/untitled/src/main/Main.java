package main;

import entities.Athletes;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int n = sc.nextInt();

        Athletes[] Athlete = new Athletes[n];
        for(int i = 0; i < Athlete.length; i++){
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Sexo: ");
            char gender = sc.next().charAt(0);
            while(gender != 'M' && gender != 'F'){
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                gender = sc.next().charAt(0);
            }
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            while(height <= 0){
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                height = sc.nextDouble();
            }
            System.out.print("Peso: ");
            double weight = sc.nextDouble();
            while(weight <= 0){
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                weight = sc.nextDouble();
            }
            
            Athlete[i] = new Athletes(name, gender, height, weight);
        }
        for (int i = 0; i < Athlete.length; i++){
            System.out.println(Athlete[i].getName());
        }
        sc.close();
    }
}
