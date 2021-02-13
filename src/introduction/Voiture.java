package introduction;


	/**Ecrire une fonction qui prend en paramètre une voiture, et un nombre de chevaux 
	Cette fonction renverra vrai si le nombre de chevaux est dans les normes (à savoir inférieur à 100)
	Pour ce faire : 
 	- Il faut créer une classe Voiture (avec des attributs)
	 */
	
public class Voiture {
	private String nom;
	private int nombreChevaux;
	private int NombreDePorte;
	private boolean hasCoffre;
	private int nombreDePorte;
	
	
	
	public Voiture (String nom, int nombreChevaux, int nombreDePorte, boolean hasCoffre) {
		this.nom = nom;
		this.nombreChevaux = nombreChevaux;
		this.nombreDePorte = nombreDePorte;
		this.hasCoffre = hasCoffre;
		}
	
	public String getNom(){
		return this.nom;
	}
	
	public int getNombreChevaux() {
		return this.nombreChevaux;
	}
	 
	public int getNombreDePorte() {
		return this.nombreDePorte;
	}
	public boolean  hasCoffre() {
		return this.hasCoffre;
	}
	
	@Override
	public String toString() {
		return "puissance de la voiture" + nombreChevaux + "coffre" +hasCoffre + "combien de porte" +NombreDePorte;
	}
	
	
	
}

