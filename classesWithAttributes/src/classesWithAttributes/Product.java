package classesWithAttributes;

public class Product {

	public Product()
	{
		
	}
	public Product(int id, String name,String description,double price,int stockAmount) {
		System.out.println("Yapýcýblok çalýþtý...");
		
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
	}

	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;

	// get okur set yazar
	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double _price) {
		this._price = _price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
}
