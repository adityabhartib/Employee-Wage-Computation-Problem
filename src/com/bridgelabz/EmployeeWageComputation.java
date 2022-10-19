package com.bridgelabz;

public class EmployeeWageComputation {
    //static variable of EmployeeWageComputation class

    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int FULLTIME = 1;
    static final int PARTTIME = 2;
    //static method for calculate empWage
     static void computeEmpWage(int working_day_per_month,int total_working_hours,int wage_per_hour){

        int empwage = 0, workingday = 1, totalempwage = 0, workinhHrs=0;//local variable computeEmpWage Block

        while (workingday <= working_day_per_month && workinhHrs<=total_working_hours) {
            double empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empcheck) {
                case FULLTIME:
                    System.out.println("Employee is Present");
                    empwage = wage_per_hour * FULL_DAY_HOUR;
                    System.out.println("working days: " + workingday);
                    System.out.println("EmpWage: " + empwage);
                    totalempwage = empwage + totalempwage;
                    workinhHrs = workinhHrs + FULL_DAY_HOUR;
                    break;
                case PARTTIME:
                    System.out.println("Employee is Part-time");
                    empwage = wage_per_hour * PART_TIME_HOUR;
                    System.out.println("working days: " + workingday);
                    System.out.println("EmpWage: " + empwage);
                    totalempwage = empwage + totalempwage;
                    workinhHrs = workinhHrs + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is Abscent");
                    System.out.println("working days: " + workingday);
                    System.out.println("EmpWage: " + empwage);
                    break;
            }
            workingday++;
        }
        System.out.println("--------------");
        System.out.println("Total Working Hrs:>" + workinhHrs + "\n-------------- \nTotal Wage:>" + totalempwage);
    }

    public static void main(String[] args) {
        System.out.println("--------Welcome to Employee Wage Computation Problem--------");
        computeEmpWage(26,150,15);
    }
}