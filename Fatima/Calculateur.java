package Fatima;

public class Calculateur {

  // Vérifie que les données sont valides
  private static void verifierDonnees(double[] donnees) {
    if (donnees == null || donnees.length == 0) {
      throw new IllegalArgumentException("Le tableau de données est vide.");
    }
  }
    // Moyenne :
    public static double calculerMoyenne(double[] donnees) {
        verifierDonnees(donnees);

        double total = 0;
        for (double valeur : donnees) {
            total += valeur;
        }

        return total / donnees.length;
    }

  // Trouver le max :
  public static double calculerMax(double[] donnees) {
        verifierDonnees(donnees);
        double max = donnees[0];
        for (int i = 1; i < donnees.length; i++) {
            if (donnees[i] > max) {
                max = donnees[i];
            }
        }
        return max;
    }

  // Trouver le min :
  public static double calculerMin(double[] donnees) {
      verifierDonnees(donnees);

      double min = donnees[0];
      for (int i = 1; i < donnees.length; i++) {
          if (donnees[i] < min) {
                min = donnees[i];
            }
        }
        return min;
    }
    }
