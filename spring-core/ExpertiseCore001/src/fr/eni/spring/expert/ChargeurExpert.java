package fr.eni.spring.expert;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import fr.eni.spring.outils.IChargerDonnees;

public class ChargeurExpert
implements IChargerExpert {

	/** Module de chargement des donnees */
	private IChargerDonnees chargeurDonnees;
	
	
	public ChargeurExpert() {
		chargeurDonnees = null;
	}
	
	public ChargeurExpert(final IChargerDonnees pChargeurDonnees) {
		this();
		setChargeurDonnees(pChargeurDonnees);
	}
	
	public void setChargeurDonnees(final IChargerDonnees pChargeurDonnees) {
		chargeurDonnees = pChargeurDonnees;
	} // setChargeurDonnees
	
	/**
	 * Construire la liste des experts references.
	 */
	@Override
	public List<Expert> chargerExperts() {
		ArrayList<Expert> _listeExpert;
		Expert _expert;
		
		// Initialisation liste
		_listeExpert = new ArrayList<Expert>();
		_expert = null;
		// Lecture des donnees
		_expert = _chargerProchainExpert();
		while (null != _expert) {
			_listeExpert.add(_expert);
			_expert = _chargerProchainExpert();			
		}
		
		return _listeExpert;
	} // chargerExpert
	
	/**
	 * Chargement de la prochaine entree de type expert.
	 * @return
	 */
	private Expert _chargerProchainExpert() {
		Expert _expert = null;
		String _strDonnees = null;
		String[] _tstrTravail;
		int _iNumero;
		
		// Chargement des donnees
		_strDonnees = chargeurDonnees.lireEntree();
		// Traitement
		if (null != _strDonnees) {
			// Des donnees lues
			// Format : nom,prenom,numero
			_tstrTravail = StringUtils.split(_strDonnees,",");
			_iNumero = (new Integer(_tstrTravail[2])).intValue();
			// Creation entite expert
			_expert = new Expert(_tstrTravail[0],
			                     _tstrTravail[1],
			                     _iNumero);
		}
		
		return _expert;
	} // _chargerProchainExpert
} // ChargeurExpert
