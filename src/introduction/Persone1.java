package introduction;

public class Persone1 {
	private int age;
	private int taille;
	private int poids;
	private int dateDeNaissance;
	private int numeroDeSecu;

	
	public Persone1 (int age,int taille,int poids, int dateDeNaissance , int numeroDeSecu){
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.dateDeNaissance = dateDeNaissance;
	    this.numeroDeSecu = numeroDeSecu;
	    
	}
	
	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}
	
	
	public void setTaille(int taille){
		this.taille = taille ;
	}
	
	
	public void setPoids(int poids){
		this.poids = poids;
	}
	
	
	public String toString(){
		return "Entrer votre age" + this.age + " puis votre taille " + this.taille + " puis votre poids " + this.poids + " votre date de naissance"+ this.dateDeNaissance + " est pour terminer votre numero de secu"+ this.numeroDeSecu; 
	}
		

}
