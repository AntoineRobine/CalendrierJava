package introduction;

import exception.AgeIllegalException;
import exception.MoitieDeVieVecue;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private int taille;
	private int poids;
	
	
	public Personne(String nom, String prenom, int age, int taille, int poids ){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
	}
	
	
	public String getNom(){
		return this.nom;
	}
	
	
	public String getPrenom(){
		return this.prenom;
	}
	
	
	public int getAge(){
		return this.age;
	}
	
	
	public int getTaille(){
		return this.taille;
	}
	
	
	public int getPoids(){
		return this.poids;
	}
	
	
	public String dateDeNaissance(int annee){
		int calcul1 = annee - this.age;
		return this.prenom  + " est né soit en " + calcul1 + " soit en " + (calcul1-1);			
	}
	
	public int IMC(){
		int operation = this.poids/(this.taille^2);
		return operation;	
	}
	
	public String Imc2(){
		String a = "tu est en insufficance pondérale";
		String b = "tu est en Corpulence normale";
		String c = "tu est en Surpoids";
		String d = "tu est en  Obésité ";
		
		int imc = IMC();
		
		if (imc < 18.5){
			return a;
		}
		else if (18.5 <imc && imc < 25){
			return b;
		}
		else if (25 < imc && imc < 30){
			return c ;
		}
		else{
			return d;
		}
	}
	
	
	public void checkAge() throws AgeIllegalException, MoitieDeVieVecue{
		if(this.age > 3 && this.age < 100) {
			System.out.println("Tu as l'âge pour être ici.");
		}
		else {
			throw new AgeIllegalException("C'est illégal Monsieur, partez svp.");
		}
		
		if(this.age == 50) {
			throw new MoitieDeVieVecue("Bien joué, t'as vécu la moitié de ta vie !");
		}
	}
	
	/**
	 * Vérifie si le nom est en majuscule 
	 * ex: "ROBINE"
	 * Si ça ne l'est pas, on lancera l'excption "NotGoodNameFormatException"
	 * Si ça l'est, on affiche "Ton nom est ok"
	 */
	public void isUppercase()thorws NomIllegalException,PrenomIllegalExcetion {
		if (c != 'a' || c != 'b' || ...){
			liste.add("tu as pas une majuscule");
		}
				
		
	  
		
	}
	
	
	/**
	 * Vérifie si la première lettre du prénom est en majuscule 
	 * ex : "Antoine"
	 * Si ça ne l'est pas, on lancera l'excption "NotGoodFirstnameFormatException"
	 * Si ça l'est, on affiche "Ton prénom est ok"
	 */
	public void isFirstCaracterUpper() {
		
	}
	
	
	@Override
	public String toString(){
		return  "Je m'appelle " + this.nom + " " + this.prenom + ". J'ai " + this.age + " ans et je fais " + this.taille + " cm. Je pèse " + this.poids + " kg." ;
	}	
}
