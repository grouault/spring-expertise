package fr.eni.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import fr.eni.spring.expert.IGererListeExpert;

/**
 * Classe de test du gestionnaire de liste des experts
 *
 */
public class ExpertiseCore002 {

	public static void main(final String[] pParams) {
		ApplicationContext _contexteAppli;
		BeanFactory _usineComposants;
		Object _objetTemp;
		IGererListeExpert _gestionExperts;
		
		// Initialiser le contexte Spring et l'usine de composants
		_contexteAppli = new GenericXmlApplicationContext("ExpertiseCore002-beans.xml");
		_usineComposants = ((GenericXmlApplicationContext)_contexteAppli).getBeanFactory();
		
		// Initialiser le gestionnaire de liste des experts
		_objetTemp = _usineComposants.getBean("gestionnaireListeExperts");
		_gestionExperts = (IGererListeExpert)_objetTemp;
		
		// Charger les donnees 
		_gestionExperts.charger();
		// Impression (pour voir le resultat !!)
		_gestionExperts.imprimer();
	} // main
} // ExpertiseCore002
