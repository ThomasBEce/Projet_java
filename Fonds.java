package Projet.Main;
import java.util.Date;
import java.util.ArrayList;

public class Fonds{
	String Nom ="XXXXX";
	float montant = 0 ;
	//ArrayList<String> date;
	Date now;
	
	public Fonds(String nom, float montant) {
		this.Nom = nom;
		this.montant = montant;
		this.now = new Date();
	}
	
	public void update(float montant) {
		String sNow = now.toString();
		this.montant = montant ;
	}
}
