package introduction;

public class Prof extends Personne{
	private String matiere;
	private boolean isMain; 
	
	public Prof(String nom, String prenom, int age, int taille, int poids, String matiere, boolean isMain) {
		super(nom, prenom, age, taille, poids);
		this.matiere = matiere;
		this.isMain = isMain;
	}
	
	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\nProf [matiere=" + matiere + ", isMain=" + isMain + "]";
	}
	
}
