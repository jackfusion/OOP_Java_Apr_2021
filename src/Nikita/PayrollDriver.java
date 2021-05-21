package Nikita;

import java.util.Scanner;

public class PayrollDriver {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int size, empType, i;
		
		System.out.print("Number of employees: ");
		size = Integer.parseInt( sn.nextLine()  );

		Employee[] employees = new Employee[size];

		for (i = 0; i < size; i++) {
			System.out.print("\nPROFILE FOR EMPLOYEE #" + (i + 1) + ":");
			System.out.print("\ntype Hourly(1), Salaried(2), Salaried Plus Commission(3) \n  Enter 1, 2, or 3 ==> ");
			empType = Integer.parseInt(sn.nextLine());

			switch (empType) {

			case 1:
				System.err.println("Hourly");
				employees[i] = new Hourly();
				((Hourly)employees[i]).load();
				break;

			case 2:
				System.err.println("Salaried");
				employees[i] = new Salaried();
				employees[i].getEarnings();
				break;

			case 3:
				System.err.println("SalariedPlusCommission");
				employees[i] = new SalariedPlusCommission();
				employees[i].getBonus();
				break;

			default:
				System.out.println("Enter 1 or 2 or 3");

			}
			//employees[i].load();
			// employees[i].getBonus();
		}

		for (i = 0; i <= size; i++)
			System.out.println(employees[i]);
		// employees[i].getEarnings();

	}
}
