package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	// SOBRECARGA = DISPONIBILIZAR MAIS DE UMA VERS�O DA MESMA OPERA��O
	// NO CASO, TEMOS O CONSTRUTOR RECEBENDO 3 PAR�METROS E TAMB�M RECEBENDO SOMENTE 2 PAR�METROS
	
	//SOBRECARGA COM OP��O DO CONSTRUTOR PADR�O
	public Product() {
		
	}
	
	//PRIMEIRA VERS�O RECEBENDO 3 PAR�METROS
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//SEGUNDA VERS�O RECEBENDO 2 PAR�METROS
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0; // OPCIONAL, N�O PRECISA DECLARAR
	}
	

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String priceTag() {
		return name 
				+ " $ " 
				+ String.format("%.2f", price);
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}