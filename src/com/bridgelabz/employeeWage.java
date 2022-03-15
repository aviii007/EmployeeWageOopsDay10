package com.bridgelabz;

public class employeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Program");

        int isFullTime=1;
        int ratePerHour=20;
        int hours=0,salary=0;
        int check=(int)Math.floor((Math.random()*10)%2);
        if(check==isFullTime)
        {
            hours=8;
        }
        salary=hours*ratePerHour;
        System.out.println("Salary is:"+salary);
    }
}
