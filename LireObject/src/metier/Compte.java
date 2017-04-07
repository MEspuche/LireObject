package metier;

import java.io.Serializable;

public class Compte implements Serializable {

	
	private int idCompte;
	private String nomCompte;
	private long solde;
	
	
	
	/**
	 * Constructeur N°1
	 * @param idCompte ID du compte
	 * @param nomCompte nom du compte
	 * @param solde solde du compte
	 */
	public Compte(int idCompte, String nomCompte, long solde) {
		super();
		this.idCompte = idCompte;
		this.nomCompte = nomCompte;
		this.solde = solde;
	}

	
	
	
	/**
	 * Contructeur N°2
	 */
	public Compte() {
		super();
	}




/**
 * Méthode d'affichage des paramètres d'un compte
 */
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", nomCompte=" + nomCompte + ", solde=" + solde + "]";
	}


	/**
	 * Getter de l'ID compte
	 * @return reourne ID compte
	 */
	public int getIdCompte() {
		return idCompte;
	}
	
	




	/**
	 * Setter de l'ID compte
	 * @param idCompte Modification de l'ID compte
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	
	/**
	 * Getter du Nom du compte
	 * @return retourne le nom du compte
	 */
	public String getNomCompte() {
		return nomCompte;
	}
	
	/**
	 * Setter du nom du compte
	 * @param nomCompte Modification du nom du compte
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}



	/**
	 * Getter du solde compte
	 * @return retourne le solde du compte
	 */
	public long getSolde() {
		return solde;
	}



	/**
	 * Setter du solde compte
	 * @param solde Modification du solde du compte
	 */
	public void setSolde(long solde) {
		this.solde = solde;
	}
	
	
	

	
	
	

	
	
	
	
}
