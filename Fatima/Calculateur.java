package Fatima;

public class Calculateur implements Statistiques {

    private void verifierDonnees(double[] donnees) {
        if (donnees == null || donnees.length == 0) {
            throw new IllegalArgumentException("Le tableau de données est vide ou null.");
        }
    }


    @Override
    public double calculerMoyenne(double[] donnees) {
        verifierDonnees(donnees);
        double total = 0;
        for (double valeur : donnees) {
            total += valeur;
        }
        return total / donnees.length;
    }


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
