package introduction;

public class Eleve extends Personne {
	private String uneClasse;
	private String MatierePrefere;
	private boolean redoublement;

	public Eleve(String nom, String prenom, int age, int taille, int poids,String uneClasse,String MatierePrefere,boolean redoublement){
		super(nom, prenom, age, taille, poids);
		
		this.uneClasse = uneClasse;
		this.MatierePrefere = MatierePrefere;
		this.redoublement = redoublement;	
	}
		
	
	public String getUneClasse(){
		return this.uneClasse ;	
	}
	
	
	public void setUneClasse(){
		this.uneClasse = uneClasse;
	}
	
	
	
}
