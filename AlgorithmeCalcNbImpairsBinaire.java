public class AlgorithmeCalcNbImpairsBinaire {
    public static void main(String[] args) {
        afficherAlgo();
    }

    public static int calcNbImpairsBinaire(int n) {
        if (n <= 3) return 1;
        return calcNbImpairsBinaireRecursive(n-1) + calcNbImpairsSum(n-2, n-3);
    }

    private static int calcNbImpairsBinaireRecursive(int n) {
        if (n <= 3) return 1;
        return calcNbImpairsBinaire(n);
    }

    private static int calcNbImpairsSum(int n1, int n2) {
        return calcNbImpairsBinaireRecursive(n1) + calcNbImpairsBinaireRecursive(n2);
    }

    public static void afficherAlgo() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Valeur " + i + ": " + calcNbImpairsBinaire(i));
        }
    }
}
