package Fatima;

public class Calculateur {
  
     //Calcule la moyenne d'un ensemble de données.
  
    public double calculerMoyenne(double[] donnees) throws ArithmeticException {
        if (donnees == null || donnees.length == 0) { // Déclancher une erreur s'il n'y a pas de données (dénominateur nul)
            throw new ArithmeticException("Erreur : Calcul impossible.");
        }

        double total = 0;
        for (double valeur : donnees) {
            validerValeur(valeur); //  Validation de chaque valeur avant de l'ajouter à la somme
            total += valeur;
        }

        return total / donnees.length;
    }

    public void validerValeur(double valeur) throws IllegalArgumentException {      // Méthode de validation pour que toutes les notes soient positives :
        if (valeur < 0) { 
            throw new IllegalArgumentException("Erreur : Valeur négative (" + valeur + ") - La note ne peut pas être négative !");
        }
    }
}
