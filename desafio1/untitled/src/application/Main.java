package application;

import entities.Salary;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Renda anual com salario: ");
        double annualSalary = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double annualServicesRevenue = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double annualCapitalGains = sc.nextDouble();
        System.out.print("Gastos medicos: ");
        double medicalExpenses = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double educationalExpenses = sc.nextDouble();
        Salary p1 = new Salary(annualSalary, annualServicesRevenue, annualCapitalGains, medicalExpenses, educationalExpenses);

        System.out.printf("%nRELATÓRIO DE IMPOSTO DE RENDA%n");
        System.out.printf("CONSOLIDADO DE RENDA:%n");
        System.out.printf("Imposto sobre salario: %.2f%n", p1.payrollTax());
        System.out.printf("Imposto sobre servço: %.2f%n", p1.servicesTax());
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", p1.capitalTax());

        System.out.printf("%nDEDUÇÕES:%n");
        System.out.printf("Máximo dedutível: %.2f%n");
        System.out.printf("Gastos dedutíveis: %.2f%n");

        System.out.printf("%nRESUMO%n");
        System.out.printf("Imposto bruto total: %.2f%n");
        System.out.printf("Abatimento: %.2f%n");
        System.out.printf("Imposto devido: %.2f%n");

        sc.close();
    }
}
