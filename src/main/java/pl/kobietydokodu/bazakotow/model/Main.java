package pl.kobietydokodu.bazakotow.model;

import java.util.Date;

import pl.kobietydokodu.bazakotow.model.Kot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kot kot = new Kot();
		
	kot.setDataurodzenia(new Date());
	kot.setImie("Albercik");
	kot.setImie_opiekuna("Cezary");
	kot.setWaga(12.2f);
	
	kot.przedstawSie();
	String s = kot.przedstawSie(); 
	System.out.println(s);
	}
	
}
