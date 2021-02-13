package introduction;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private int taille;
	private int poids;
	
	
	
	public Personne(String nom,String prenom,int age,int taille,int poids ) {
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
		return this.prenom  + " " + " est n� soit en " + calcul1 + " soit en " + (calcul1-1);			
	}
	
	public int IMC(){
		int operation = this.poids/(this.taille^2);
		return operation;	
	}
	public String Imc2(){
		String a = "tu est en insufficance pond�rale";
		String b = "tu est en Corpulence normale";
		String c = "tu est en Surpoids";
		String d = "tu est en  Ob�sit� ";
		
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
	
		
	
	
	
			
		
	
	
		
		
		
		

	
	
	@Override
	public String toString(){
		return  "Mon nom " + this.nom + " mon prenon " + this.prenom + " j'ai " + this.age + " je fais " + this.taille + " je p�se " + this.poids + " kg" ;
	}
	
	
	
}