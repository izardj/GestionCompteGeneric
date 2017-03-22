package presentation;

import java.util.Scanner;

import metier.Compte;
import service.CompteService;

/**
 * Classe Lanceur
 * @author Stagiaire
 * @version 1.0
 */
public class Lanceur {

	/**
	 * M�thode main qui est l'entr�e du programme
	 * @param args arguments de la m�thode main
	 */
	public static void main(String[] args) {		
		// instanciation de la classe Scanner avec l'input de l'utilisateur en argument
		Scanner sc = new Scanner(System.in);
		
		// d�claration de la couche service
		CompteService cs = new CompteService();
		
		Compte compte = null;
		boolean quitter = false;
		
		
		while(!quitter){
			// Afficher le menu
			System.out.println("Menu:");
			System.out.println("1 = Ajouter compte:");
			System.out.println("2 = Cr�diter compte:");
			System.out.println("3 = D�biter Compte");
			System.out.println("4 = Quitter");
			
			// r�cup�rer choix menu
			int choix = sc.nextInt();
			
			switch (choix) {
			case 1:
				// Ajouter compte
				compte = creationCompte(sc);
				
				// afficher compte
				System.out.println(compte);
				break;
				
			case 2:
				if(compte == null){
					compte = creationCompte(sc);
				}
				// Cr�diter compte
				System.out.println("Saisir montant � cr�diter:");
				cs.ajouter(compte, sc.nextLong());
				System.out.println("Nouveau solde :" + compte.getSolde());
				break;
				
			case 3:
				if(compte == null){
					compte = creationCompte(sc);
				}
				// D�biter compte
				// retirer
				System.out.println("Saisir montant � retirer:");
				cs.retirer(compte, sc.nextLong());
				System.out.println("Nouveau solde :" + compte.getSolde());
				break;
				
			case 4:
				// Quitter
				quitter = true;
				// fermer le scanner
				sc.close();
				break;
	
			default:
				break;
			}
		}
	}
	/**
	 * Cr�e un nouveau compte � partir de saisies utilisateur
	 * @param sc Objet Scanner correspondant aux saisies en console
	 * @return un objet Compte
	 */
	private static Compte creationCompte(Scanner sc){
		// Demander idCompte
		System.out.println("Veuillez saisir l'identifiant du compte : ");
		// Recup�rer le idCompte
		int idCompte = sc.nextInt();
		
		// Demander nomCompte
		System.out.println("Veuillez saisir le nom du compte : ");
		// Recup�rer le nomCompte
		sc.nextLine(); // vide le buffer
		String nomCompte = sc.nextLine();
		
		// Demander soldeCompte
		System.out.println("Veuillez saisir le solde du compte : ");
		// Recup�rer le soldeCompte
		long soldeCompte = sc.nextLong();
		
		// creation du compte
		Compte compte = new Compte(idCompte, nomCompte, soldeCompte);
		return compte;
	}
}
