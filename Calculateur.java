/**
 * L'interface Calculateur définit les opérations pour calculer une valeur basée sur un nombre donné et obtenir un compteur interne.
 */
public interface Calculateur {
    
    /**
     * Obtient la valeur actuelle du compteur interne.
     * 
     * @return La valeur actuelle du compteur.
     */
    public long obtenirCompteur();

    /**
     * Calcule une nouvelle valeur basée sur le nombre N fourni.
     * 
     * @param N Le nombre sur lequel effectuer le calcul.
     * @return Le résultat du calcul.
     */
    long calculer(long N);
}
