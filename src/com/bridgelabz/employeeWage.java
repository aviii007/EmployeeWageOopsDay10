package com.bridgelabz;

public class employeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Program");
        int isFullTime=1;
        int check=(int)Math.floor((Math.random()*10)%2);
        if(check==isFullTime)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
