package introduction;

import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class

import exception.AgeIllegalException;
import exception.MoitieDeVieVecue;

public class Main{
  
	public static void main(String[] args){
		Main m = new Main();
		/*int a = m.poly(10,20,30) ;
		System.out.println(a);
		
		int b =m.message("salut ca va");
		System.out.println(b);
	
		int c= m.multiplication(5,55);
		System.out.println(c);
		
		boolean d = m.exerciceSteven(true, 1521.25f , "Dordoras");
		System.out.println(d);
		
		Voiture fiatPanda = new Voiture("fiatPanda",68,4,true);
		Voiture aventador = new Voiture("aventador",452,2,false);
		Voiture fiesta = new Voiture("fiesta",100,4,true);
		boolean e = m.verifChevaux(fiesta);
		System.out.println(e);
	   
		//Personne antoine = new Personne("Robine","Antoine",13,164,42);
		//System.out.println(antoine.toString(2021));
		
		Avion boingA320 = new Avion ("boingA320",145,"discordAirline","a320");
		Avion boing720 = new Avion("boing720",250,"javaAirline","a720");
		boolean f = m.verifSiege(boing720);
		System.out.println(f);
		
		System.out.println(boingA320.verifSiege());
		
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("entrer votre nom ");
		
		String nom = sc.nextLine();
		System.out.println("mon nom est " + nom); 
		
		System.out.println("entrer votre prenom");
		
		String prenom = sc.nextLine();
		System.out.println("mon prenom est " + prenom);
		
		System.out.println("entrer votre age ");
		
		int age = sc.nextInt();
		System.out.println("mon age est "+age);
		
		System.out.println("entre votre taille ");
		
		int taille = sc.nextInt();
		System.out.println("ma taille est " + taille);
		
		System.out.println("entre ton poids ");
		
		int poids = sc.nextInt();
		System.out.println("mon pois est " + poids);
		
		Personne personne = new Personne(nom,prenom,age,taille,poids);
		System.out.println(personne.toString());
		
		String g = personne.Imc2();
		System.out.println(g); 
		
		String[] jours = {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
		String[] mois  = {"janvier","fevrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","decembre"}; 
		Calendrier calendrier2021 = new Calendrier (jours,mois,2021);
		System.out.println(calendrier2021.phraseBissextile());

		
		Jour mardi10 = new Jour( 10,"mardi");
		ArrayList<Jour> jours = new ArrayList<Jour>();
		jours.add(mardi10);

		Mois Fevrier = new Mois(2,"Fevrier",jours);
		System.out.println(Fevrier.toStringJour());
		
		Jour Lundi10 = new Jour (10 ,"Lundi" );
		Mois Decembre = new Mois (12,"Decembre",jours);
		jours.add(Lundi10);
		ArrayList<Mois> mois = new ArrayList<Mois>();
		mois.add(Decembre);
		
		Calendrier calendrier2020 = new Calendrier(jours,mois,2021);
		System.out.println(calendrier2020);
		
		
		p.setMatiere("Maths");
		System.out.println(p.getMatiere());*/
		
		Prof steven = new Prof("Drouet", "Steven", 50, 168, 80, "Informatique", true);
		
		try {
			steven.checkAge();
		}
		catch(AgeIllegalException e) {
			System.out.println(e.toString());
		}
		catch(MoitieDeVieVecue e) {
			System.out.println(e.toString());
		}	
	}
	
	Eleve eleve1 = new Eleve("Robine","Antoine",13,165,43,"4e3","leSport",false);
		
	
	 public int poly(int a, int b ,int c) {
		int calcule = a*b*c ;
		return calcule;		
	}
	
	 
	 public int message(String msg) {
		int longueur =msg.length();
		return longueur ;
	
	}

	public int multiplication(int a, int b) {
		int operation =a*b;
		return operation;
	}
	
	
	/**
	 * Ecrire une fonction qui prend un bool�en, un nombre d�cimal, 
	 * un pr�nom et qui renvoie vrai si le bool�en est vrai, que le nombre d�cimal
	 *  > 980 et que le pr�nom est "Dordoras". Renvoie faux sinon
	 */
	
	public boolean exerciceSteven (boolean bool , float nombreDecimal , String prenom) {
		if (nombreDecimal > 980 && prenom =="Dordoras" && bool == true){
				return true ;
		}
		else {
				return false;
		}
		
	}
	
	public boolean verifChevaux(Voiture vehicule) {
		if (vehicule.getNombreChevaux() <= 100) {
			return true; 
		}
		
		else {
			return false;	
		}
			
	
	
	
	
	
	}
	
	public boolean verifSiege(Avion vehiculeAerien){
		if (vehiculeAerien.getNombreDeSiege()%2==0 ||vehiculeAerien.getNombreDeSiege() > 200) {
			return true;
		}
	
		
		else {
			return false;
		}
	}
	
	
	}
		
			
		

	
