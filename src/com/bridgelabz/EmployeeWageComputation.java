package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private  CompanyEmpWage[]companyEmpWages;
    public EmployeeWageComputation(){
        companyEmpWages=new CompanyEmpWage[5];
    }
    private  void setTotalWage(){
        for (int i=0; i< companyEmpWages.length; i++){
            System.out.println(companyEmpWages[i]);
            
        }
    }
    public static int calculateEmpWage(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        int empHrs, totalEmpHrs = 0, totalWorkingDays = 0,totalEmpWage;

        while( totalEmpHrs <= maxHrsPerMonth && totalWorkingDays <= numWorkingDays) {

            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
//                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    totalEmpHrs+=empHrs;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    totalEmpHrs+=empHrs;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    totalEmpHrs+=empHrs;
                    break;
            }
            totalWorkingDays++;
            System.out.println("Day No :"+ totalWorkingDays +" Emp Hrs: "+ empHrs);
        }
        totalEmpWage=totalEmpHrs*wagePerHr;
        return totalEmpWage;

    }
    public static void main(String[] args) {
        System.out.println("--------Welcome to Employee Wage Computation Problem--------");

        System.out.println("JIo");
        calculateEmpWage("Jio",15,24,100);
        System.out.println("-----------------------------------------");
        System.out.println("Vodafone");
        calculateEmpWage("Vodafone",20,25,110);
    }
}