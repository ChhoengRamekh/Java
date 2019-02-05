
public class Employee extends Person implements ITaxPayer{
	private String company;
	private double salary;
	
	public Employee(String id, String name) {
		super(id, name);
	}
	
	public Employee(String id, String name, String company, double salary) {
		super(id, name);
		this.company = company;
		this.salary = salary;
	}
	
	public String getCompany() {
		return company;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double calculateTax(double salary) {
		 double tax = 0;
		 double netSalary = 0;
		if(salary<=200) {
			tax = salary * 0.05;
		} else {
			tax = salary * 0.1;
		}
		netSalary = salary - tax;
		return tax;
		
	}
	
	public void display() {
		System.out.println("ID: "+getId()+", Name: "+getName()+", Company: "+getCompany()+", NetSalary: "+calculateTax(salary));
	}
}
