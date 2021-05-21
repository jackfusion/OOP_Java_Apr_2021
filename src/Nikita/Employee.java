package Nikita;

import java.util.Calendar;
import java.util.Scanner;

public abstract class Employee {

    private String _name;
    private String _socialSecurityNumber;
    private int _birthdayMonth;
    private int _birthdayWeek;
    protected static final double birthdayBonus = 100;



    public void load() {
        Scanner sn = new Scanner(System.in);

        System.out.print("Name ==> ");
        _name = sn.nextLine();
        System.out.print("Social Security Number ==> ");
        _socialSecurityNumber = sn.nextLine();
        System.out.print("Birthday Month (1-12) ==> ");
        _birthdayMonth = Integer.parseInt(sn.nextLine() );
        System.out.print("Birthday bonus week (1-4) ==> ");
        _birthdayWeek = Integer.parseInt(sn.nextLine() );


    }
    public String toString() {
        return String.format("Employee: %1s\nSocial Security Number: %2$s", _name, _socialSecurityNumber);

    }
    public double getBonus() {
        double birthdayBonus = 100;
        Calendar calendar = Calendar.getInstance();
        int calMonth = calendar.get(Calendar.MONTH) + 1;
        int calDay = calendar.get(Calendar.DAY_OF_WEEK);
        if(_birthdayMonth == calDay && _birthdayWeek == calMonth) {
              return birthdayBonus;
        }
        else {
        return 0;
        }


    }
    public abstract double getEarnings();
}