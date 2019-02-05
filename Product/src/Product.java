
public class Product {

	private String name;
	private String[] model;
	private double[] price;
	int numberProduct;
	
	
	public Product(String name) {
		this.name = name;
		this.model = new String[5];
		this.price = new double[5];
		numberProduct = 0;
	}
	
	
	
	public String setName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Product name is : "+name;
	}
	
	public void addProduct (String model, double price) {
		if(numberProduct>= this.model.length) {
			System.out.println("One Product could contain only 5 model");
		} else {
			this.model[numberProduct]= model;
			this.price[numberProduct]= price;
			numberProduct++;
		}
	}
	
	
	public void printProductDetail() {
		for(int i = 0; i< numberProduct; i++) {
			System.out.println(i+1+" - Model: "+model[i]+", Price: "+price[i]);
		}
	}
	
	public double getTotalPrice() {
		double sum = 0;
		double discount = 0;
		for (int i = 0; i < numberProduct; i++) {
			sum += price[i];
		}
		
		if(sum >= 1000) {
			discount = sum * 0.1;
		}
		return sum- discount;
		
	}
	
	
}
