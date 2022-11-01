package com.bridgelabz;

public class EmployeeWageComputation implements EmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private CompanyEmpWage[] companyEmpWages;

    public EmployeeWageComputation() {
        companyEmpWages = new CompanyEmpWage[5];
    }

    private void setTotalWage() {
        for (int i = 0; i < companyEmpWages.length; i++) {
            System.out.println(companyEmpWages[i]);

        }
    }
        @Override
        public void calculateEmpWage(String companyName, int wagePerHrs, int numOfWorkingDays, int numOfWorkingHrs) {
            int empHrs, totalEmpHrs = 0, totalWorkingDays = 0, totalEmpWage;

            while (totalEmpHrs <= numOfWorkingHrs && totalWorkingDays <= numOfWorkingDays) {

                double empCheck = Math.floor(Math.random() * 10) % 3;

                switch ((int) empCheck) {
                    case IS_PART_TIME:
//                    System.out.println("Employee is Present as PART TIME");
                        empHrs = 4;
                        totalEmpHrs += empHrs;
                        break;
                    case IS_FULL_TIME:
                        System.out.println("Employee is Present as FULL TIME");
                        empHrs = 8;
                        totalEmpHrs += empHrs;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        empHrs = 0;
                        totalEmpHrs += empHrs;
                        break;
                }
                totalWorkingDays++;
                System.out.println("Day No :" + totalWorkingDays + " Emp Hrs: " + empHrs);
            }
            totalEmpWage = totalEmpHrs * wagePerHrs;
            System.out.println("Total Wage For Company :" + totalEmpWage);
        }

        public static void main(String[] args) {
            System.out.println("--------Welcome to Employee Wage Computation Problem--------");
            EmployeeWageComputation emp1 = new EmployeeWageComputation();
            EmployeeWageComputation emp2 = new EmployeeWageComputation();
            System.out.println("JIo");
            emp1.calculateEmpWage("Jio", 20, 24, 100);
            System.out.println("-----------------------------------------");
            System.out.println("Vodafone");
            emp2.calculateEmpWage("Vodafone", 20, 25, 110);
        }
    }
