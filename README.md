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

* **Intellij :** Pour l'importation et l'exécution du projet.

---

## Comment l'utiliser ?

L'utilisation est simple : téléchargez le projet en allant sur **`< > code` > `Download ZIP`**, décompressez le zip, puis sur Intellij, importez le projet en allant sur **`File` > `Open`**, puis exécutez la classe `Main.java` qui se trouve dans le dossier `Wren`.

#### Merci d'avoir pris le temps de consulter notre projet !
