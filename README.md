## spring-expertise
Gestion simplifiée de compétences détenues par des experts.
==> matrice des compétences ou annuaire d'expertise

## Entités informationnelles
- *liste des **Experts*** 
- *liste des **Thèmes*** pour lesquels une expertise est recensée ou pourrait l'être.
  * une expertise est recensée dès lors qu'un expert se déclare compétent sur le sujet.
  * une expertise peut être présente dans la liste bien qu'aucun expert n'y soit rattaché.
- matrice de toutes les ***compétences disponibles***.
  * une ***Compétence*** peut se définir comme l'association entre un expert et un thème.
  * un même expert peut-être référencé dans plusieurs compétences
- complément : une table de données statistiques est mise en place pour tracer les modifications apportées aux informations présentes dans l'annuaire

## Principales règles de gestion applicables
- Expert: [numero, nom,  prenom, date_creation, date_modification]
- Theme: [clé, libellé, date_création, date_modification]
- Compétence: association : [Theme] n <----> n [Expert] 
  * un même thème peut être couvert par plusieurs experts
  * un expert peut être déclaré compétent sur plusieurs thèmes 

## Fonctions attendues
- Consultation de la liste des Experts
  * Modification, suppression, et modification d'entrées
- Consultation de la liste des Thémes
  * Modification, suppression, et modification d'entrées
- Recherche d'une compétence soit à partir d'un thème, soit à partir d'un expert
  * Modification, suppression, et modification d'entrées

## Description Technique
- Utilisation d'une architecture en couche via la mise en oeuvre de modules Spring.
  * la configuration des différents modules sont séparés les uns des autres pour conserver autant d'autonomie que posssible à chacune des composantes de l'application.
    * Tiers transport (réception des requêtes et émission des réponses)
    * Tiers présentation de données
    * Tiers métier (traitement métier des informations)
    * Tiers données et persistence des informations
    * Tiers sécurité des informations
    * Tiers administration et Supervision
- Accès à l'application via une architecture web
- Définition des rôles utilisateurs afin de distinguer  les fonctions d'administration des fonctions de consultation.
- Base de données relationnelles à travers une couche ORM
