package com.capgemini.day3;

public class SalesManager extends Employee {

	private static int basic;
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public static int medical=250;
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesManager(int basic) {
		super();
		SalesManager.basic = basic;
		
	}
	public double getPetrolAllowance() {
		return petrolAllowance;
	}
	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}
	public double getFoodAllowance() {
		return foodAllowance;
	}
	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
	public double getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		SalesManager.basic = basic;
	}
	
	public double calPallowance(double basic)
	{
		return basic*(0.08);
	}
	public double calFallowance(double basic)
	{
		return basic*(0.13);
	}
	
	public double calOallowance(double basic)
	{
		return basic*(0.03);
	}
	public static double calSalary(int income) {
		
		
		
		Employee ref=new Employee();
		SalesManager sm = new SalesManager(income);
	
		
		double netsalary = ref.salaryCalculation(basic,medical);
		
		netsalary += sm.calFallowance(basic)+sm.calOallowance(basic)+sm.calPallowance(basic);
		// TODO Auto-generated method stub
		System.out.println("NetSalary of Sales Manager:"+netsalary);
		return netsalary;
	}
	
	
	
	
	
	
}
