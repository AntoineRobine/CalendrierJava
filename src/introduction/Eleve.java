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
	
	
	public void setUneClasse(String uneClasse){
		this.uneClasse = uneClasse  ;
	}
	
	
	public String getMatierePrefere(){
		return this.MatierePrefere;
	}
	
	
	public void setMatierePrefere(String MatierePrefere){
		this.MatierePrefere = MatierePrefere;
	}
	
	public boolean getRedoublement(){
		return this.redoublement;
	}
	
	public void setRedoublement (boolean redoublement){
		this.redoublement = redoublement;
	}
	
	
	@Override
	public String toString(){
		return super.toString() +  "\nEleve [matiere Prefere = " + this.MatierePrefere + "maClasse =" + this.uneClasse + "]";
	}
	
	
}
