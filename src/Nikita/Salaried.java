package Nikita;

import java.util.Scanner;

public class Salaried extends Employee {

	private double _weeklySalary;

	public void load() {
		super.load();
		Scanner sn = new Scanner(System.in);
		System.out.println("Salary ==>");
		_weeklySalary = sn.nextDouble();
	}

	public double getEarnings() {
		double payment = _weeklySalary + getBonus();
		return payment;
	}
}
