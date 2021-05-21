package Nikita;

import java.util.Scanner;

public class Hourly extends Employee {

	private double _hourlyPay;
	private double _hoursWorked;

	public void load() {
		super.load();
		Scanner sn = new Scanner(System.in);
		System.out.print("Hourly pay ==> ");
		
		_hourlyPay = Float.parseFloat(sn.nextLine());
		System.out.print("Hours worked this past week ==> ");
		_hoursWorked = Float.parseFloat(sn.nextLine());
	}

	public double getEarnings() {
		double payment;
		payment = _hourlyPay * _hoursWorked + getBonus();

		if (_hoursWorked <= 40) {
			payment = _hoursWorked * _hourlyPay;
		} else {
			payment = 40 * _hourlyPay + ((_hoursWorked - 40) * _hourlyPay * 1.5);
		}
		return payment;
	}

	public String toString() {
		return super.toString() + String.format("\npaycheck: $%,.2f", getEarnings());
	}
}
