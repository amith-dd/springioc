package spring.phoneandcharger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Charger charger1 = context.getBean(Charger.class);
		Charger charger2 = context.getBean(Charger.class);
		Charger charger3 = context.getBean(Charger.class);
		
		System.out.println(charger1);
		System.out.println(charger2);
		System.out.println(charger3);
		
		
		
	}

}
