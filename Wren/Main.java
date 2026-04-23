package Wren;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    String fichierEntree = "donnees.csv";
    String fichierSortie = "resume.csv";

    // On crée l'objet ici (car on utilise une interface)
    Calculateur calc = new Calculateur();

    try {
      String[] noms = LecteurCSV.lireNomsColonnes(fichierEntree);
      List<double[]> donnees = LecteurCSV.lireColonnes(fichierEntree);

      if (donnees.isEmpty()) return;

      System.out.println("--- ANALYSE EN COURS ---");

      for (int i = 0; i < donnees. size(); i++) {
        double[] col = donnees.get(i);
        String titre = (i < noms.length) ? noms[i] : "Col " + i;

        // Utilisation de l'objet 'calc'
        System.out.println("\nNom: " + titre);
        System.out.printf("Moyenne: %.2f | Minimum: %.1f | Maximum: %.1f%n",
                          calc.calculerMoyenne(col),
                          calc.calculerMin(col),
                          calc.calculerMax(col));
      }

      // Génération du rapport Bonus
      Rapport.genererCSV(fichierSortie, noms, donnees);
      System.out.println("\nRapport généré : " + fichierSortie);
      
    } catch (Exception e) {
      System.err.println("Erreur: " + e.getMessage());
    }
  }
}
