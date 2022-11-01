package com.bridgelabz;

public class CompanyEmpWage {
    public String companyName;
    public int wagePerHr;
    public int numWorkingDays;
   public int maxHrsPerMonth;
    public int totalEmpWage;
    public CompanyEmpWage(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage" +
                "Company Name :"+companyName+
                "totalEmpWage :" + totalEmpWage;
    }
}
