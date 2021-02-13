package introduction;

import java.util.ArrayList;

public class Mois {
	private int numeroDeMois;
	private String unLibelle;
	private ArrayList<Jour> jours;
	
	public  Mois (int numeroDeMois,String unLibelle , ArrayList<Jour> jours){
		this.numeroDeMois = numeroDeMois;
		this.unLibelle = unLibelle;
		this.jours= jours;
		
	}
	
	public int GetnumeroDeMois() {
		return this.numeroDeMois;
	}
	
	
	public void SetnumeroDeMois(){
		this.numeroDeMois = numeroDeMois; 
	}
	
	
	public String GetunLibelle(){
		return this.unLibelle;
	}
	
	
	public void SetunLibelle(){
		this.unLibelle= unLibelle;
	}
	
	public ArrayList<Jour> GetJour(){
		return this.jours;
	}
	
	
	public void Setjour(){
		this.jours = jours;
	}
	
	public String toString(){
		return " le numero de mois est " + this.numeroDeMois + " le libelle est " + this.unLibelle;
	}
	
	public String toStringJour(){
		return " les jours sont " + this.jours;
	}


}
