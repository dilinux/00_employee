package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	public double result;
	
	public double netSalary() {
		
		return result = grossSalary - tax;
		
	}
	
	public void increaseSalary(double percentage) {
		
		this.percentage = percentage;
		result = grossSalary + (grossSalary * (percentage/100)) - tax;
	 
	}	

}
