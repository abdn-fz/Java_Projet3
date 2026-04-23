# Projet 3 : Analyse de données CSV
**Évaluation sommative - UA3**

## Présentation du projet
Ce projet consiste à développer une application Java collaborative qui lit, valide et analyse des données d'un fichier CSV. Elle calcule les statistiques clés suivantes : **moyenne, minimum et maximum**, tout en assurant le contrôle de la saisie et la cohérence logique des données d'entrée.

## Équipe et contexte
* **L'équipe :**
    * **Fatima Zohra ABOUDEINE :** Développement du moteur d'analyse (Lecture CSV, Logique de calcul, Interfaces).
    * **Wren :** Orchestration du programme (Main) et génération du rapport statistique.
* **Programme :** Sciences des données appliquées (Coop).
* **Module :** Programmation avancée.
* **Formatrice :** Madame Soumaya Elhosni.
* **Collège :** La Cité, Ottawa.
* **Étape :** Étape 2, Hiver 2026.

---

## Que fait l'application ?

* **Lecture de fichier :** Extraction automatisée de données numériques depuis le fichier `.csv`.
* **Analyse Statistique :** Calcul de la moyenne, du minimum et du maximum pour chaque colonne.
* **Gestion des Exceptions et Sécurité :**
    * **Validation de l'existence du fichier :** Gestion de l'absence du document.
    * **Validation des formats numériques :** Ignore les données non numériques.
    * **Détection des divisions par zéro :** Cas d'un fichier vide.
    * **Validation logique des données :** Cohérence des entrées (ex: détection des notes négatives).
* **Génération de Rapport (Bonus) :** Exportation automatique des résultats dans un fichier de synthèse nommé `resume.csv`.
* **Modularité :** Organisation du code en plusieurs classes et dossiers séparés (`Fatima/` et `Wren/`) pour respecter les principes de la programmation orientée objet.

## De quoi ai-je besoin ?

* **Java SDK (JDK) :** Version 11 ou supérieure.
* **Terminal/Console :** Pour l'exécution des commandes de compilation.
* **Fichier de données :** Un fichier `donnees.csv` à la racine du projet contenant des valeurs numériques.

---

## Comment l'utiliser ?

### 1. Préparation
Placez votre fichier de données nommé `donnees.csv` à la racine du projet.

### 2. Compilation
Pour compiler le projet en incluant les deux dossiers d'étudiants, utilisez la commande suivante à la racine :

```bash
javac Fatima/*.java Wren/*.java
