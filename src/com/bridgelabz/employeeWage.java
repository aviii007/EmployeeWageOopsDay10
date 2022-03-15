package com.bridgelabz;

public class employeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Program");

        int isPartTime=1;
        int isFullTime=2;
        int ratePerHour=20;
        int hours=0,salary=0;
        int check=(int)Math.floor((Math.random()*10)%3);
        if(check==isFullTime)
        {
            hours=8;
        }
        else if(check==isPartTime)
        {
            hours=4;
        }
        salary=hours*ratePerHour;
        System.out.println("Salary is:"+salary);
    }
}
