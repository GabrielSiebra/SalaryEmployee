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

        System.out.println();
        System.out.println("Employee#" + (i+1)+ ":");
        System.out.print("Id: ");
        Integer id = sc.nextInt();
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        list.add(emp);
    }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary= sc.nextInt();





    sc.close();
    }
    public int hasId(List<Employee> list,int id){
        for (int i = 0; i < list.size(); i++ ){
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}