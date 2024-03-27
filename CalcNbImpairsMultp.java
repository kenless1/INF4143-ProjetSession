import java.io.*;

public class CalcNbImpairsMultp {

    private static long K = 0; // compteur nombre d'appels

    public static void main(String[] args) {
        try {
            PrintStream fileOut = new PrintStream("./out.txt");
            System.setOut(fileOut); // Redirige System.out vers le fichier out.txt
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        for (long N = 5; N <= 30; N = N + 5) {

            long startTime = System.nanoTime(); // Début de mesure du temps

            CalcNbImpairs(N);

            long endTime = System.nanoTime(); // Fin de mesure du temps
            double duration = (endTime - startTime) * 0.000001; // Calcul de la durée d'exécution en ms

            System.out.print("Pour N = " + N + ", la Sequence est : ");
            afficherSequence(N);
            System.out.print("\n");

            System.out.println("Le nombre d'appels récursif pour " + N + " est " + K);
            System.out.println("Temps d'exécution pour N = " + N + " : " + duration + " millisecondes.\n\n");
        }

    }

    public static int CalcNbImpairs(long N) {
        K++;
        if (N<=3){
            return 1;
        }else {
            return (CalcNbImpairs(N - 1) + CalcNbImpairs(N - 2) + CalcNbImpairs(N - 3));
        }
    }

    public static void afficherSequence(long N) {
        K = 0;
        for (long i = 1; i <= N; i++) {
            System.out.print(CalcNbImpairs(i) + "  ");
        }
    }
}
