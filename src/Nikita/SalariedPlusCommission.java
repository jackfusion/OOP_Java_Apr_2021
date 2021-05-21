package Nikita;

import java.util.Scanner;

public class SalariedPlusCommission extends Salaried {

	double _sales;
	double _commissionRate;

	public void load() {
		super.load();
		Scanner sn = new Scanner(System.in);
		System.out.println("Sales for this past week ==> ");
		_sales = sn.nextDouble();
		System.out.println("Sales commission rate (fraction paid to employee) ==> ");
		_commissionRate = sn.nextDouble();
	}

	public double getEarnings() {
		double payment = _commissionRate * _sales;
		return _commissionRate;
	}
}