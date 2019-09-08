package fr.eni.spring;

import fr.eni.spring.expert.ChargeurExpert;
import fr.eni.spring.expert.GestionnaireListeExperts;
import fr.eni.spring.expert.IChargerExpert;
import fr.eni.spring.expert.IGererListeExpert;
import fr.eni.spring.outils.ChargeurFichierTexte;
import fr.eni.spring.outils.IChargerDonnees;

/**
 * Classe de test du gestionnaire de liste des experts
 *
 */
public class ExpertiseCore001 {

	public static void main(final String[] pParams) {
		IGererListeExpert _gestionExperts;
		IChargerExpert _chargeurExperts;
		IChargerDonnees _chargeurDonnees;
		
		// Initialiser le gestionnaire de liste des experts
		_gestionExperts = new GestionnaireListeExperts();
		
		// Charger les donnees 
		// Necessite de definir le module de chargement
		_chargeurDonnees = new ChargeurFichierTexte("donnees/experts.txt");
		_chargeurExperts = new ChargeurExpert(_chargeurDonnees);
		// Chargement
		_gestionExperts.charger(_chargeurExperts);
		// Impression (pour voir le resultat !!)
		_gestionExperts.imprimer();
	} // main
} // ExpertiseCore001
