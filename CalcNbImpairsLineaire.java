public class CalcNbImpairsLineaire {

    public static void main(String[] args) {
        afficherAlgoLineaire();

    }

    public static int calcNbImpairs(int n){
        if(n < 4) return 1;
        return calcNbImpairsRecursive(1, 1, 1, n, 4);
    }

    private static int calcNbImpairsRecursive(int premier, int deuxieme, int troisieme, int n, int compteur) {
        if(compteur == n) return premier + deuxieme + troisieme;
        return calcNbImpairsRecursive(deuxieme, troisieme, premier + deuxieme + troisieme, n, compteur + 1);
    }

    public static void afficherAlgoLineaire(){
        for(int i = 1; i <= 20; i++) { 
            System.out.println("Valeur " + i + ": " + calcNbImpairs(i));
        }
    }

}
