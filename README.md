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
- Compétence: association <==> [Theme] n <----> n [Expert] 
 * un même thème peut être couvert par plusieurs experts
 * un expert peut être déclaré compétent sur plusieurs thèmes 

## TODO
#1
mojombo#1
mojombo/github-flavored-markdown#1

```javascript
private void fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```
