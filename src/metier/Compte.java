/**
 * 
 */
package metier;

/**
 * Classe qui défini un Compte
 * @author Stagiaire
 * @version 1.0
 */
public class Compte {
	private int id;
	private String nomCompte;
	private long solde;
	
	/**
	 * Méthode constructeur de Compte
	 * @param id identifiant du compte
	 * @param nomCompte nom du compte
	 * @param solde solde du compte
	 */
	public Compte(int id, String nomCompte, long solde) {
		super();
		this.id = id;
		this.nomCompte = nomCompte;
		this.solde = solde;
	}

	/**
	 * @return l'identifiant
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id l'identifiant du compte
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return le nom du compte
	 */
	public String getNomCompte() {
		return nomCompte;
	}

	/**
	 * @param nomCompte le nom du compte à définir
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	/**
	 * @return le solde
	 */
	public long getSolde() {
		return solde;
	}

	/**
	 * @param solde le solde à définir
	 */
	public void setSolde(long solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Compte [id=" + id + ", nomCompte=" + nomCompte + ", solde=" + solde + "]";
	}
	
	

}
