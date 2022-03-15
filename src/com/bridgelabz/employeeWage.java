package com.bridgelabz;

public class employeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Program");

        int isPartTime=1;
        int isFullTime=2;
        int ratePerHour=20;
        int days=20;
        int hours=0,salary=0,totalSalary=0;
        for(int counter=1;counter<=days;counter++)
        {
            int check=(int)Math.floor((Math.random()*10)%3);
            switch(check)
            {
                case 2:
                    hours=8;
                    break;
                case 1:
                    hours=4;
                    break;
                default:
                    hours=0;
                    break;
            }
            System.out.println(salary);
            salary=hours*ratePerHour;
            totalSalary+=salary;
        }
        System.out.println("Salary of employee in a month is:"+totalSalary);
    }

}
