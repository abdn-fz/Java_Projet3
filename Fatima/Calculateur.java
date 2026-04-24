package Fatima;

public class Calculateur implements Statistiques {

    // Méthode pour vérifier si le dénominateur est nul et déclancher une erreur si c'est le cas :
    private void verifierDonnees(double[] donnees) {
        if (donnees == null || donnees.length == 0) {
            throw new IllegalArgumentException("Le tableau de données est vide ou null.");
        }
    }

    // Méthode pour le calcul de la moyenne :
    @Override
    public double calculerMoyenne(double[] donnees) {
        verifierDonnees(donnees);
        double total = 0;
        for (int i = 0; i < donnees.length; i++) {
            total += donnees[i];
        }
        return total / donnees.length;
    }

    // Méthode pour le calcul du min :
    @Override
    public double calculerMin(double[] donnees) {
        verifierDonnees(donnees);
        double min = donnees[0];
        for (int i = 1; i < donnees.length; i++) {
            if (donnees[i] < min) {
                min = donnees[i];
            }
        }
        return min;
    }

    // Méthode pour le calcul du max :
    @Override
    public double calculerMax(double[] donnees) {
        verifierDonnees(donnees);
        double max = donnees[0];
        for (int i = 1; i < donnees.length; i++) {
            if (donnees[i] > max) {
                max = donnees[i];
            }
        }
        return max;
    }
}
