package introduction;

public class Agent extends Personne {
	private String role;
	private int salaire;

	
	public Agent(String nom, String prenom, int age, int taille, int poids, String role, int salaire) {
		super(nom, prenom, age, taille, poids);
		this.role = role;
		this.salaire = salaire;
	}
	
	
	public String getRole(){
		return role;
	}
	
	
	public void setRole(String role){
		this.role = role;
	}
	
	
	public int  getSalaire(){
		return salaire;
	}
	
	
	public void setSalaire (int salaire){
		this.salaire = salaire;
	}
	
	
	@Override
	public String toString(){
		return super.toString() + "\nAgent[role=" + role + "salaire =" + salaire + "]"; 
	}

}
