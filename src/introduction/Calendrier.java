package introduction;

import java.util.ArrayList;

public class Calendrier {
	private ArrayList<Jour> jours;
	private ArrayList<Mois> mois;
	private int annee;
	
	public Calendrier (ArrayList<Jour> jours,ArrayList<Mois> mois,int annee ){
		this.jours = jours;
		this.mois  = mois;
		this.annee = annee;
	}
	
	public ArrayList<Jour> getJours(){
		return this.jours;
	}
	
	public void setJour(ArrayList<Jour> jours){
		this.jours = jours;
	}
	
	
	public ArrayList<Mois> getMois(){
		return this.mois;
	}
	
	public void setMois(){
		this.mois = mois;
	}
	
	public int getAnnee(ArrayList<Mois> Mois){
		return this.annee; 
	}
	
	public void setAnnee(){
		this.annee = annee;
	}
	
	public boolean bissextile(){
		if (this.annee %4 == 0 && !(this.annee % 100 == 0) || this.annee % 400 == 0){
			return true;
		}
		else{
			return false;
		}	
	}
	
	public String phraseBissextile(){
		boolean a = bissextile() ;
		if (a == true){
			return "l'annee est bissextile ";
		}
		else{
			return "l'annee est pas bissextile";
		}
	}
	
	@Override
	public String  toString(){
		return " les jours sont " + this.jours + " les mois sont " + this.mois + " l'annee est " + this.annee;
		
	}

}
