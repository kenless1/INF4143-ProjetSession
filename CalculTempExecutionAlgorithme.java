import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Cette classe mesure et compare le temps d'exécution des algorithmes implémentés
 * par les classes qui satisfont à l'interface {@code Calculateur}. Elle écrit les résultats,
 * incluant le temps d'exécution et le nombre d'opérations effectuées, dans des fichiers spécifiés.
 */
public class CalculTempExecutionAlgorithme {

    /**
     * Point d'entrée principal du programme. Exécute les calculs en utilisant deux implémentations
     * différentes de {@code Calculateur} et écrit les résultats dans des fichiers.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        executerCalculEtEcrireResultat("outLinaire.txt", new CalcNbImpairsLineaire());
        executerCalculEtEcrireResultat("outMult.txt", new CalcNbImpairsMultp());
        executerCalculEtEcrireResultat("outLinaireTerminal.txt", new CalcNbImpairsLineaireTerminal());
    }

    /**
     * Exécute un calcul pour une série de valeurs de N, mesure le temps d'exécution,
     * et écrit les résultats dans un fichier. Les résultats incluent la valeur calculée,
     * le temps d'exécution en millisecondes, et le nombre total d'opérations effectuées
     * pour chaque valeur de N.
     *
     * @param nomFichier Le nom du fichier où écrire les résultats.
     * @param calculateur L'instance de {@code Calculateur} utilisée pour effectuer les calculs.
     */
    public static void executerCalculEtEcrireResultat(String nomFichier, Calculateur calculateur) {
        try (PrintStream fileOut = new PrintStream("./" + nomFichier)) {
            System.setOut(fileOut);
            for (long N = 5; N <= 30; N += 5) {
                long startTime = System.nanoTime();
                long valeur = calculateur.calculer(N);
                long endTime = System.nanoTime();
                double duration = (endTime - startTime) * 0.000001;
                
                System.out.println("Valeur de N: " + N + " valeur de " + valeur);
                System.out.println("Temps d'exécution pour N = " + N + " : " + duration + " ms");
                System.out.println("Nombre d'execution: " + calculateur.obtenirCompteur() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

