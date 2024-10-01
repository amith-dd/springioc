package spring.phoneandcharger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	@Value("1")
	private int id;
	@Value("Xiaomi")
	private String brand;
	@Value("10000")
	private double price;
	@Autowired
	private Charger charger;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", price=" + price + ", charger=" + charger + "]";
	}
	
	
	
}
