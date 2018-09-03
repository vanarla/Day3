package com.capgemini.day3;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	private double hra;
	private double pf;
	private double grossSalary;
	private double netSalary;
	private static double PT=200;
	
	Employee(){
	}	
		
	public Employee(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		
		
	}
		
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public static double getPT() {
		return PT;
	}

	public static void setPT(double pT) {
		PT = pT;
	}

	
	
	public double salaryCalculation(int basic, int medical) {
		
		this.basicSalary=basic;
		this.medical=medical;
		hra=calHra(basicSalary);
		pf=calPf(basicSalary);
		grossSalary=basicSalary+hra+this.medical;
		netSalary=grossSalary-(pf+PT);
		System.out.println("Employee-ID:"+ employeeId);
		System.out.println("Employee-Name:"+ employeeName);
		System.out.println("Net Salary of employee:"+netSalary);
		
		// TODO Auto-generated method stub
		return netSalary;
	}
	
	
	public double calPf(double basic) {
		double result=basic*(0.12);
		// TODO Auto-generated method stub
		return result;
	}
	
	public double calHra(double input) {
		double result= (input*(0.5));
		return result;
	}
}