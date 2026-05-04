package application;

import entities.Champion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Champion> champions = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            System.out.printf("Digite os dados do %d%n campeão: ", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Vida inicial: ");
            Integer life = sc.nextInt();
            System.out.print("Ataque: ");
            Integer attack = sc.nextInt();
            System.out.print("Armadura: ");
            Integer armor = sc.nextInt();
            champions.add(new Champion(name, life, attack, armor));
        }
        System.out.print("Quantos turnos deseja executar? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Resultado do turno %d:", i);
            System.out.printf("%s: %d de vida", champions.get(0).getName()
            );
            System.out.printf("%s %d de vida: ",champions.get(1).getName()
            );
        }

        sc.close();
    }
}