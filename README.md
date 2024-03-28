# INF4143-Algorithmique

Dans ce projet de programmation, nous concevons un algorithme (en pseudocode) et son implémentation (en Java) de deux versions récursives d'un calculateur CalcNbImpairs. L'objectif est de comparer expérimentalement leurs performances d'exécution. 

Les deux versions des calculs récursifs utilisent une stratégie linéaire et une autre multiple, respectivement : CalcNbImpairsLin et CalcNbImpairsMultp.

Les nombres CalcNbImpairs sont inspirés des nombres de Fibonacci mais ils commencent par trois valeurs prédéterminées (1 1 1), chaque valeur étant ensuite la somme des trois valeurs précédentes. Les premiers nombres CalcNbImpairs sont:
1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, 355, 653, 1201, 2209, 4063, 7473, 13745, 25281, 46499, ...

Pour chaque version implémentée, nous calculons CalcNbImpairs(5), CalcNbImpairs(10), etc., par incrément de 5 jusqu'à CalcNbImpairs(100). Nous utilisons la fonction de temps prédéfinie de Java, à cette fin. Les résultats sont consignés dans le fichier out.txt.
