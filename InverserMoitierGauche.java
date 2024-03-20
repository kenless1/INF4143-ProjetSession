/**
 * InverserMoitierGauche
 */
public class InverserMoitierGauche {

    public static void main(String[] args) {
        
        int[] tableauPair = {1, 2, 3, 4, 5, 6};
        AlgoInverserMoitierGauche(tableauPair);
        afficher(tableauPair);
        int[] tableauImpair = {1, 2, 3, 4, 5, 6, 7};
        AlgoInverserMoitierGauche(tableauImpair);
        afficher(tableauImpair);
    }

    public static void AlgoInverserMoitierGauche(int[] tableau){
        int tailleTableau = tableau.length;
        int limiteTableau = (tailleTableau % 2 == 0) ? tailleTableau / 2 : (tailleTableau / 2) + 1;
        for (int i = 0; i < limiteTableau / 2; i++) {
            int indiceElementEchange = limiteTableau - i - 1;
            int temp = tableau[i];
            tableau[i] = tableau[indiceElementEchange];
            tableau[indiceElementEchange] = temp;
        }
    }

    public static void afficher(int[] tableau){
        for (int val : tableau) {
            System.out.print(val + " ");
        }
        System.out.println();
    }   
}


