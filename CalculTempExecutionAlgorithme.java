import java.io.FileNotFoundException;
import java.io.PrintStream;

public class CalculTempExecutionAlgorithme {

    public static void main(String[] args) {
        executerCalculEtEcrireResultat("outLinaire.txt", new CalcNbImpairsLineaire());
        executerCalculEtEcrireResultat("outMult.txt", new CalcNbImpairsMultp());
    }
    
    


    public static void executerCalculEtEcrireResultat(String nomFichier, Calculateur calculateur) {
        try (PrintStream fileOut = new PrintStream("./" + nomFichier)) {
            System.setOut(fileOut);
            for (long N = 5; N <= 30; N += 5) {
                long startTime = System.nanoTime();
                long valeur=calculateur.calculer(N);
                long endTime = System.nanoTime();
                double duration = (endTime - startTime) * 0.000001;
                
                System.out.println("Valeur de N:"+N+" valeur de "+valeur);
                System.out.println("Temps d'exécution pour N = " + N + " : " + duration + " ms");
                System.out.println("Nombre d'execution: "+calculateur.obtenirCompteur()+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
