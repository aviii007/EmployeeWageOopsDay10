package com.bridgelabz;

public class employeeWage {
    static int isFullTime=2;
    static int isPartTime=1;
    static int maxHours=100;
    static int ratePerHour=20;
    static int days=20;
    static int totalHours=0;
    static int totalDays=0;
    public static int getWorkingHours(int check)
    {
        int hours;
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
        return hours;
    }
    public static int attendanceCheck()
    {
        int result=(int)Math.floor((Math.random()*10)%3);
        return result;
    }
    public static void print(int totalDays,int workHours,int totalHours,int dailySalary,int totalSalary)
    {
        System.out.println(totalDays+"\t"+workHours+"\t\t"+totalHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
    }
    public static void employee()
    {
        int check=0,workHours=0,dailySalary=0,totalSalary=0;
        System.out.println("Day\tDaily Hours\tTotal Hours\tDaily Wage\tTotal Wage");
        while(totalHours<maxHours && totalDays<days)
        {
            totalDays+=1;
            check=attendanceCheck();
            workHours=getWorkingHours(check);
            totalHours=totalHours+workHours;
            dailySalary=workHours*ratePerHour;
            totalSalary=totalHours*ratePerHour;
            print(totalDays,workHours,totalHours,dailySalary,totalSalary);
        }
        System.out.println("Total Salary:"+totalSalary);
    }

    public static void main(String[] args) {
        employeeWage obj=new employeeWage();
        obj.employee();
    }
}


