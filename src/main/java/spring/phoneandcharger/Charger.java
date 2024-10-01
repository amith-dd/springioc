package spring.phoneandcharger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Charger {
	@Value("1")
	private int id;
	@Value("65")
	private double watt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWatt() {
		return watt;
	}

	public void setWatt(double watt) {
		this.watt = watt;
	}

	

	

}
