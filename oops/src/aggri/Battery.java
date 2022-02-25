package aggri;

public class Battery {
 int price;
 String name;
 String manifacture;
public Battery(int price, String name, String manifacture) {
	super();
	this.price = price;
	this.name = name;
	this.manifacture = manifacture;
}
@Override
public String toString() {
	return "Battery [price=" + price + ", name=" + name + ", manifacture=" + manifacture + "]";
}
}
