package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	Product product=new Product(5,"Laptop","Msi GE Raider",20000,5);
	
	
	
	
	product.setName("Laptop");
	product.setId(1);
	product.setDescription("Msi Laptop");
	product.setPrice(12000);
	product.setStockAmount(20);
	
	ProductManager productManager=new ProductManager();
	productManager.Add(product);
	
	
	
	


	}

}
