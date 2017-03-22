package service;

import metier.Compte;

/**
 * Classe permettant de g�rer un compte
 * @author Stagiaire
 *
 */
public class CompteService {
	/**
	 * Permet d'ajouter un montant sur un compte
	 * @param compte Compte � cr�diter
	 * @param montant Montant � cr�diter
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
	 * @param compte Compte � d�biter
	 * @param montant montant � d�biter
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
	 * @param compte Compte manipul�
	 * @return Retourne le solde
	 */
	public long solde(Compte compte){
		return compte.getSolde();
	}
}
