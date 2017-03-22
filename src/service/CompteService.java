package service;

import metier.Compte;

/**
 * Classe permettant de gérer un compte
 * @author Stagiaire
 *
 */
public class CompteService {
	/**
	 * Permet d'ajouter un montant sur un compte
	 * @param compte Compte à créditer
	 * @param montant Montant à créditer
	 * @return Le nouveau solde
	 */
	public long ajouter(Compte compte, long montant){
		if(montant >= 0){
			compte.setSolde(compte.getSolde() + montant);
		}
		return compte.getSolde();
	}
	/**
	 * Permet de retirer un montant sur un compte
	 * @param compte Compte à débiter
	 * @param montant montant à débiter
	 * @return Retourne le  solde
	 */
	public long retirer(Compte compte, long montant){
		if(montant >= 0){
			if(montant <= compte.getSolde()){
				compte.setSolde(compte.getSolde() - montant);
			}
		}
		return compte.getSolde();
	}
	/**
	 * Permet de retourner le solde courant d'un compte
	 * @param compte Compte manipulé
	 * @return Retourne le solde
	 */
	public long solde(Compte compte){
		return compte.getSolde();
	}
}
