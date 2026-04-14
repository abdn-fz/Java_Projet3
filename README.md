# Projet 3 : Analyse de données CSV
**Évaluation sommative - UA3**

## Qu'est-ce que c'est ?
Ce projet consiste à développer une application Java qui lit, valide et analyse des données d'un fichier CSV. Elle calcule les statistiques clés suivantes : **moyenne, minimum et maximum**, tout en assurant le contrôle de la saisie et la cohérence logique des données d'entrée.

## Qui sommes-nous ?
* **Étudiante :** Fatima Zohra ABOUDEINE
* **Programme :** Sciences des données appliquées (Coop)
* **Module :** Programmation avancée
* **Formatrice :** Madame Soumaya Elhosni
* **Collège :** La Cité, Ottawa
* **Étape :** Étape 2, Hiver 2026

---

## Que fait l'application ?
* **Lecture de fichier :** Extraction automatisée de données numériques depuis le fichier `.csv`.
* **Analyse Statistique :** Calcul de la moyenne, du minimum et du maximum.
* **Gestion des Exceptions et Sécurité :**
    * Validation de l'existence du fichier (gestion de l'absence du document).
    * Validation des formats numériques (ignore les données non numériques).
    * Détection des divisions par zéro (cas d'un fichier vide).
    * Validation logique des données (ex: détection des notes négatives).
* **Modularité :** Séparation stricte entre la logique de calcul (`Calculateur.java`) et l'orchestration (`Main.java`).

## De quoi ai-je besoin ?
* **Java SDK (JDK) :** Version 11 ou supérieure.
* **Terminal/Console :** Pour l'exécution des commandes de compilation.
* **Fichier de données :** Un fichier `donnees.csv` contenant des valeurs numériques.

---

## Comment l'utiliser ?
1. **Préparation :** Placez votre fichier de données nommé `donnees.csv` à la racine du projet.
2. **Compilation :** Compilez les fichiers Java via le terminal :
   ```bash
   javac Fatima/*.java
   ```
3. Exécution : Lancez l'application avec la commande :

   ```bash
   java Fatima.Main
   ```
