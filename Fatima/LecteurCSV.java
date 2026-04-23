package Fatima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecteurCSV {

    // Méthode pour lire le csv et transfert des colonnes dans des tableaux :
    public static List<double[]> lireColonnes(String cheminFichier) throws IOException {
        
        // Préparation de la liste des tableaux pour recevoir les colonnes :
        List<double[]> colonnes = new ArrayList<>();

        // Lecture ligne par ligne :
        BufferedReader br = new BufferedReader(new FileReader(cheminFichier));

            // Lecture des titres (1ère ligne) :
            String ligne = br.readLine(); 

        // Cas de fichier vide :
        if (ligne == null) {
            br.close();
            return colonnes;
        }

        // Compter les colonnes :
        String[] headers = ligne.split(",");
        int nbColonnes = headers.length;

        // Listes temporaires pour recevoir les données :
        List<List<Double>> temp = new ArrayList<>();
        for (int i = 0; i < nbColonnes; i++) {
            temp.add(new ArrayList<>()); // 
        }

        // Boucle de lecture : 
        while ((ligne = br.readLine()) != null) {
            
            // Découper la ligne actuelle en un tableau String[] :
            String[] valeurs = ligne.split(",");

            // Parcourir chaque case de la ligne :
            for (int i = 0; i < valeurs.length; i++) {
                try {
                    // Convertir le texte en nombre (double) :
                    double nombre = Double.parseDouble(valeurs[i].trim());
                 
                    // Ajouter ce nombre dans la liste temporaire qui de sa colonne :
                    temp.get(i).add(nombre);
                } 
                catch (NumberFormatException e) {
                    System.err.println("Valeur non numérique détectée");

                }
            }
        }

        // Fermer le fichier
        br.close();

        // Convertir les List<Double> flexibles en tableaux double[] rigides (pour l'utilisation dans la classe Calculateur) :
        for (int i = 0; i < nbColonnes; i++) {
            List<Double> liste = temp.get(i);
            double[] tab = new double[liste.size()];

            // Recopier chaque nombre de la liste dans le tableau :
            for (int j = 0; j < liste.size(); j++) {
                tab[j] = liste.get(j);
            }

            // Ajouter le tableau terminé à la liste de tableaux finale :
            colonnes.add(tab);
        }

        return colonnes;
    }

    // Méthode utilitaire pour récupérer uniquement les noms des colonnes :
    public static String[] lireNomsColonnes(String cheminFichier) throws IOException {
        // Ouvrir un nouveau lecteur spécifique pour l'en-tête :
        BufferedReader br = new BufferedReader(new FileReader(cheminFichier));
        
        // Lire uniquement la première ligne
        String ligne = br.readLine();
        
        // Refermer le fichier :
        br.close();

        // Si la ligne existe, découper par virgule, sinon rendre un tableau vide :
        if (ligne == null) return new String[0];
        return ligne.split(",");
    }
}
