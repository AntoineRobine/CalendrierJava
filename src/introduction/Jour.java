package introduction;

import java.util.ArrayList;

public class Jour {
	
	private int numeroDeJour;
	private String libelle ;
	
	public Jour(int numeroDeJour, String libelle ){
		this.numeroDeJour = numeroDeJour;
		this.libelle = libelle;
	}
	
	public int getNumeroDeJour(){
		return this.numeroDeJour;
	}
	
	
	public void setNumeroDeJour(){
		this.numeroDeJour = numeroDeJour;
	}
	
	
	public String getLibelle(){
		return this.libelle;
	}
	
	
	public void setLibelle(){
		this.libelle = libelle;
	}
	
	public ArrayList<Jour> creeSemainesMois(int nombreMaxiumDeJour){
		ArrayList<Jour> jourDeMois = new ArrayList<Jour>();
		ArrayList<String> jourDeSemaine = new ArrayList<String>();
		jourDeSemaine.add("lundi");
		jourDeSemaine.add("mardi");
		jourDeSemaine.add("mercredi");
		jourDeSemaine.add("jeudi");
		jourDeSemaine.add("vendredi");
		jourDeSemaine.add("samedi");
		jourDeSemaine.add("dimanche");
		for (int i = 0; i < jourDeSemaine.size();i++){
			for (int j = 0; j < nombreMaxiumDeJour/7;j++){
				Jour jour = new Jour (j,jourDeSemaine.get(i));
				jourDeMois.add(jour);
			}
			
		}
			
		
		return jourDeMois;	
	}
	
	
	
	
	
	
	public String toString(){
		return " le numero de jour est " + this.numeroDeJour + " la fete est " + this.libelle;
	}
	
	

}
