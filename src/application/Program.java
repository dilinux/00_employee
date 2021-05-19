package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		Employee employee = new Employee();
		
		System.out.println("Enter the name of employee: ");
		employee.name = sc.nextLine();
		
		System.out.println("Enter the gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Enter the tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
				
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee.name + ", $ " + employee.result);
		
											
		sc.close();
	}

}
