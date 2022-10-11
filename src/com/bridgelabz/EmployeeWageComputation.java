package com.bridgelabz;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int FULLTIME=1;
    static final int PARTTIME=2;

    public static void main(String[] args) {
        int empwage=0;
        System.out.println("--------Welcome to Employee Wage Computation Problem--------");
        double empcheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empcheck == FULLTIME) {
            System.out.println("Employee is Present");
            empwage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("EmpWage: " + empwage);
        } else if (empcheck==PARTTIME) {
            System.out.println("Employee is Parttime");
            empwage=WAGE_PER_HOUR*PART_TIME_HOUR;
            System.out.println("EmpWage: "+empwage);
        }else {
        System.out.println("Employee is Abscent");
            System.out.println("EmpWage: "+empwage);
        }
    }
}