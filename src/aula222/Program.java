package aula222;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula219.entities.Product;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.00;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
