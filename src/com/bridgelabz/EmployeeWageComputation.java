package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Employee Wage Computation Problem--------");
        double empcheck=(int)Math.floor(Math.random() * 10) % 2;
        if (empcheck==1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Abscent");
    }
}