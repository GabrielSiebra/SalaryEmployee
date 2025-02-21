package application;

import entities.Employee;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    int N = sc.nextInt();

    for (int i=0; i<N; i++){

        System.out.print("Employee#" + (i+1)+ ":");
        System.out.print("Id: ");
        Integer id = sc.nextInt();
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

    }










    }
}