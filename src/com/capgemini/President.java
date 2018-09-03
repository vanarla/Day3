package com.capgemini.day3;



	
	public class President extends Employee{
		
		private static int basic;
		private static int medical=250;
		private int kilometers;
		private static double tallowances;
		private double teleallowances = 2000;
		
		

		public President() {
			super();
			// TODO Auto-generated constructor stub
		}

		public President(int basic, int kilometers) {
			super();
			President.basic = basic;
			this.kilometers = kilometers;
			
		}
		
		public static int getBasic() {
			return basic;
		}

		public static void setBasic(int basic) {
			President.basic = basic;
		}

		public double getMedical() {
			return medical;
		}

		public void setMedical(int medical) {
			President.medical = medical;
		}

		public int getKilometers() {
			return kilometers;
		}

		public void setKilometers(int kilometers) {
			this.kilometers = kilometers;
		}

		public double getTallowances() {
			return tallowances;
		}
		public void setTallowances(double tallowances) {
			President.tallowances = tallowances;
		}

		public double getTeleallowances() {
			return teleallowances;
		}

		public void setTeleallowances(double teleallowances) {
			this.teleallowances = teleallowances;
		}

		public static double calSalary(int income , int kilometers) {
			
			Employee ref=new Employee();
			President p = new President(income , kilometers);
			
			tallowances = p.calTour(kilometers);
		
			
			double netsalary = ref.salaryCalculation(basic,medical);
			
			netsalary += President.tallowances + p.teleallowances;
			// TODO Auto-generated method stub
			System.out.println("NetSalary of President:"+netsalary);
			return netsalary;
			// TODO Auto-generated method stub
		
		}
		
		public int calTour(int kilometers)
		{
			return kilometers * 8;
		}
		
	}

