package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private String companyName;
    private int wagePerHr;
    private int numWorkingDays;
    private int maxHrsPerMonth;
    private int totalEmpWage;
    public EmployeeWageComputation(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }
    public void calculateEmpWage() {
        // Local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Compute Emp Wage for Month
        while( totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numWorkingDays) {
            totalWorkingDays++;     //Incrementing Working Days
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day No :"+ totalWorkingDays +" Emp Hrs: "+ empHrs);
        }
        totalEmpWage = totalEmpHrs * wagePerHr;
    }
    @Override
    public String toString() {
        return "Total Employee Wage for Company : "+ companyName +" is : "+totalEmpWage;
    }


    public static void main(String[] args) {
        System.out.println("--------Welcome to Employee Wage Computation Problem--------");
        EmployeeWageComputation jio = new EmployeeWageComputation("JIO",100,20,26);

        EmployeeWageComputation vodafone = new EmployeeWageComputation("VODAFONE",110,25,25);
        jio.calculateEmpWage();
        System.out.println(jio.toString());
        System.out.println("-----------------------------------------");
        vodafone.calculateEmpWage();
        System.out.println(vodafone.toString());
    }
}