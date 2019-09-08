package fr.eni.spring.expert;

import java.util.Iterator;
import java.util.List;

public class GestionnaireListeExperts 
implements IGererListeExpert {
	
	/** La liste des experts */
	private List<Expert> listeExperts;
	

	/** 
	 * Chargement de la liste des experts 
	 */
	@Override
	public void charger(final IChargerExpert pChargeur) {
		List<Expert> _listTravail;

		_listTravail = pChargeur.chargerExperts();
		// Ebregistrement dans le gestionnaire
		listeExperts = _listTravail;
	} // charger

	@Override
	public void ajouter(final Expert pExpert) {
	} // ajouter

	@Override
	public List<Expert> chercherParNom(final String pNomExpert) {
		return null;
	} // chercherParNom

	@Override
	public Expert chercherParNumero(final int pNumeroExpert) {
		return null;
	} // chercherParNumero

	@Override
	public void modifier(final Expert pExpert) {
	} // modifier

	@Override
	public void supprimer(final int pNumeroExpert) {
	} // supprimer
	
	public void imprimer() {
		Iterator<Expert> _iteExperts;
		Expert _expertTemp;
		
		// Parcourir la liste pour edition sur console
		_iteExperts = listeExperts.iterator();
		System.out.println("*** Debut de liste des experts ***");
		while (true == _iteExperts.hasNext()) {
			_expertTemp = _iteExperts.next();
			System.out.println(_expertTemp);
		}
		System.out.println("*** Fin de liste des experts ***");
	} // imprimer
} // GestionnaireListeExperts
