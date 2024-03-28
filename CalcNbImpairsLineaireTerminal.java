public class CalcNbImpairsLineaireTerminal implements Calculateur{
    /**
     * Compteur utilisé pour enregistrer le nombre d'appels de la méthode récursive.
     */
    private static long K = 0;

    /**
     * Obtient le nombre total d'appels de méthode récursive effectués par cette instance.
     *
     * @return Le nombre total d'appels de méthode.
     */
    public long getCompteur() { return K; }

    /**
     * Calcule le nombre d'impairs dans une séquence jusqu'à {@code n} en utilisant une méthode spécifique.
     *
     * @param n Le nombre jusqu'auquel calculer les impairs.
     * @return Le nombre d'impairs calculés.
     */
    public static long calcNbImpairs(long n) {
        if (n < 4) return 1;
        return calcNbImpairsRecursive(1, 1, 1, n, 4);
    }

    /**
     * Méthode récursive pour calculer le nombre d'impairs dans une séquence.
     *
     * @param premier Le premier terme de la séquence.
     * @param deuxieme Le deuxième terme de la séquence.
     * @param troisieme Le troisième terme de la séquence.
     * @param n Le nombre total de termes dans la séquence.
     * @param compteur Le compteur actuel de la séquence.
     * @return Le nombre d'impairs dans la séquence jusqu'à {@code n}.
     */
    private static long calcNbImpairsRecursive(long premier, long deuxieme, long troisieme, long n, long compteur) {
        K++;
        if (compteur == n) {
            return premier + deuxieme + troisieme;
        }
        long nouveauTroisieme = premier + deuxieme + troisieme;
        long nouveauCompteur = compteur + 1;
        return calcNbImpairsRecursive(deuxieme, troisieme, nouveauTroisieme, n, nouveauCompteur);
    }

    /**
     * Implémente la méthode {@code calculer} de l'interface {@code Calculateur}.
     * Déclenche le calcul du nombre d'impairs dans une séquence jusqu'à {@code N}.
     *
     * @param N Le nombre jusqu'auquel calculer les impairs.
     * @return Le nombre d'impairs calculés.
     */
    @Override
    public long calculer(long N) {
        return calcNbImpairs(N);
    }

    /**
     * Implémente la méthode {@code obtenirCompteur} de l'interface {@code Calculateur}.
     * Récupère le nombre total d'appels de méthode récursive effectués.
     *
     * @return Le nombre total d'appels de méthode.
     */
    @Override
    public long obtenirCompteur() {
        return getCompteur();
    }
}
