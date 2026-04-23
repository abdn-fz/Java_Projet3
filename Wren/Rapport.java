import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// Génère un fichier CSV avec les résultats
public class Rapport {
  public static void genererCSV(String fichier, String[] noms, List<double[]> colonnes) throws IOException {
    FileWriter writer = new FileWriter(fichier);

    // On crée l'outil pour faire les calculs
    Calculateur calc = new Calculateur();

    writer.write("Colonne, Moyenne, Min, Max\n");

    for (int i = 0; i < colonnes.size(); i++) {
      double[] data = colonnes.get(i);

      // On utilise l'objet 'calc' crée plus haut, (et pas la Classe directement)
      double moyenne = calc.calculerMoyenne(data);
      double min = calc.calculerMin(data);
      double max = calc.calculerMax(data);

      // Sécurité si le fichier CSV a plus de colonnes que de noms
      String nomColonne = (i < noms.length) ? noms[i] : "Col" + i;

      writer.write(nomColonne + "," + moyenne + "," + min + "," + max + "\n");
    }
    writer.close();
  }
}
