/**
 * Implémentation de l'interface {@code Calculateur} utilisant une méthode multiplicative
 * pour calculer le nombre d'impairs dans une séquence donnée. Cette implémentation compte
 * également le nombre d'appels récursifs effectués pour obtenir le résultat.
 */
public class CalcNbImpairsMultp implements Calculateur {

    /**
     * Compteur statique pour enregistrer le nombre d'appels récursifs à la méthode {@code CalcNbImpairs}.
     */
    private static long K = 0;

    /**
     * Récupère le nombre total d'appels récursifs effectués par cette instance.
     *
     * @return Le nombre total d'appels à la méthode.
     */
    public long getCompteur() { return K; }

    /**
     * Calcul récursif du nombre d'impairs dans une séquence jusqu'à N. Cette méthode
     * incrémente le compteur d'appels à chaque appel récursif.
     *
     * @param N Le nombre jusqu'auquel calculer les impairs.
     * @return Le nombre total d'impairs dans la séquence jusqu'à N.
     */
    public static int CalcNbImpairs(long N) {
        K++; 
        if (N <= 3) {
            return 1; 
        } else {
            return (CalcNbImpairs(N - 1) + CalcNbImpairs(N - 2) + CalcNbImpairs(N - 3));
        }
    }

    /**
     * Implémente la méthode {@code calculer} de l'interface {@code Calculateur}.
     * Lance le calcul du nombre d'impairs jusqu'à N en utilisant la méthode récursive {@code CalcNbImpairs}.
     *
     * @param N Le nombre jusqu'auquel calculer les impairs.
     * @return Le nombre d'impairs calculés.
     */
    @Override
    public long calculer(long N) {
        return CalcNbImpairs(N);
    }

    /**
     * Implémente la méthode {@code obtenirCompteur} de l'interface {@code Calculateur}.
     * Renvoie le nombre total d'appels récursifs effectués par {@code CalcNbImpairs}.
     *
     * @return Le nombre total d'appels récursifs.
     */
    @Override
    public long obtenirCompteur() {
        return getCompteur();
    }
}
