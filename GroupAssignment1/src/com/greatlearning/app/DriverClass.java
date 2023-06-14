package com.greatlearning.app;

public class DriverClass {

	public static void main(String[] args) {
		AdminDepartment a1=new AdminDepartment();
		a1.departmentName();
		System.out.println("Welcome to Admin Department");
		a1.getTodaysWork();
		System.out.println("Complete your Documents submission");
		a1.getWorkDeadline();
		System.out.println("Complete by EOD");
		a1.isTodayAHoliday();
		System.out.println("Today is not a Holiday");
		
		HRDepartment h1=new HRDepartment();
		h1.departmentName();
		System.out.println("Welcome to HR Department");
		h1.doActivity();
		System.out.println("Team Lunch");
		h1.getTodaysWork();
		System.out.println("Fill todays timesheet and mark your attendence");
		h1.getWorkDeadline();
		System.out.println("Complete by EOD");
		h1.isTodayAHoliday();
		System.out.println("Today is not a Holiday");
		
		TechDepartment t1=new TechDepartment();
		t1.departmentName();
		System.out.println("Welcome to Tech Department");
		t1.getTodaysWork();
		System.out.println("Complete coding of module 1");
		t1.getTodaysWork();
		System.out.println("Complete by EOD");
		t1.getTechStackInformation();
		System.out.println("Core Java");
		t1.isTodayAHoliday();
		System.out.println("Today is not a Holiday");
		
		
		

	}

}
