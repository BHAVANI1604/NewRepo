package day1;

import java.util.Arrays;

public class Phone {
	String name;
	
	int price;
   Model []model;
@Override
public String toString() {
	return "Phone [name=" + name + ", price=" + price + ", model=" + Arrays.toString(model) + "]";
}
public Phone(String name, int price, Model[] model) {
	super();
	this.name = name;
	this.price = price;
	this.model = model;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Model[] getModel() {
	return model;
}
public void setModel(Model[] model) {
	this.model = model;
}
	

}
