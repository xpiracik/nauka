package pl.kobietydokodu.bazakotow.model;

import java.util.Date;

public class Kot {

	private String imie;
	private Date dataurodzenia;
	private Float waga;
	private String imie_opiekuna;
	
	public String  przedstawSie(){
		return "M�j kot "+ imie + " urodzi� si� "+dataurodzenia+" i wa�y "+waga+" , a zajmuje si� nim "+imie_opiekuna;
		
		
	}
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Date getDataurodzenia() {
		return dataurodzenia;
	}

	public void setDataurodzenia(Date dataurodzenia) {
		this.dataurodzenia = dataurodzenia;
	}

	public Float getWaga() {
		return waga;
	}

	public void setWaga(Float waga) {
		this.waga = waga;
	}

	public String getImie_opiekuna() {
		return imie_opiekuna;
	}

	public void setImie_opiekuna(String imie_opiekuna) {
		this.imie_opiekuna = imie_opiekuna;
	}





}
