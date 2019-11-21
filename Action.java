package Projet.Main;

public class Action extends Fonds{
	String NomAc = "Ac";
	private float Taux=1;
	public Action(String nom, float montant) {
		super(nom, montant);
	}
	public void UpdateMontant(float montant, float Taux) {
		this.montant = montant;
		this.montant = montant*Taux;
	}

}
