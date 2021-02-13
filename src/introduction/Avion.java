package introduction;

public class Avion {
	private String marque;
	private int nombreDeSiege;
	private String laCompanie;
	private String modele;
	
	
	
	public Avion(String marque,int nombreDeSiege,String laCompanie,String modele ) {
		this.marque = marque;
		this.nombreDeSiege = nombreDeSiege ;
		this.laCompanie = laCompanie;
		this.modele = modele;
	}
	
	public String getMarque(){
		return this.marque;
	}
	
	
	public int getNombreDeSiege(){
		return this.nombreDeSiege;
	}
	
	
	public String LaCompanie(){
		return this.laCompanie;
	}
	
	
	public String Modele(){
		return this.modele;
	}
	
	public boolean verifSiege(){
		if (this.nombreDeSiege % 2 == 0 || this.nombreDeSiege > 200) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	@Override
	public String toString(){
		return "le modele est "+ this.marque + " le nombre de siege est de "+ this.nombreDeSiege + " la companie est " + this.laCompanie + " le modele est" + this.modele; 
	}
}
