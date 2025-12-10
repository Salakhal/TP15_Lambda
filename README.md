# TP 15 : Expressions Lambda et API Stream en Java

Ce projet contient l'ensemble des exercices du Travail Pratique (TP) 15. Il a pour objectif d'explorer la programmation fonctionnelle en Java introduite depuis la version 8.

## 📋 Description

Ce TP couvre les concepts fondamentaux et avancés suivants :
* **Expressions Lambda** : Syntaxe, capture de variables.
* **Interfaces Fonctionnelles** : `Predicate`, `Consumer`, `Function`, `Supplier`.
* **Références de méthodes** : L'opérateur `::`.
* **API Stream** : Traitement déclaratif des collections (filter, map, reduce, collect).
* **Composition** : Chaînage de fonctions et de prédicats.
* **Programmation Asynchrone** : Utilisation de `CompletableFuture`.
* **Design Patterns** : Stratégie de validation, Mémoïsation.

## 🛠️ Prérequis

* **Java Development Kit (JDK)** : Version 17 ou supérieure recommandée (minimum Java 8).
* **IDE** : Eclipse, IntelliJ IDEA ou VS Code.

## 📂 Structure du Projet

Le code source se trouve dans le package `ma.tp.lambda`. Voici la description de chaque fichier :

### 1. Fondamentaux
* `LambdaIntro.java` : Comparaison entre classes anonymes et expressions lambda.
* `InterfacesFonctionnelles.java` : Utilisation des interfaces standard (`java.util.function`).
* `InterfacesPrimitives.java` : Versions optimisées pour types primitifs (`IntPredicate`, etc.).
* `SyntaxeLambda.java` : Différentes syntaxes d'écriture des lambdas.

### 2. Fonctionnalités Avancées
* `CaptureLambda.java` : Scope des variables et capture de `this`.
* `ReferencesMethodes.java` : Utilisation des références de méthodes statiques, d'instance et constructeurs.
* `CompositionFonctions.java` : Combinaison de fonctions avec `andThen`, `compose`, `and`, `or`.

### 3. API Stream (Collections)
* `StreamBasics.java` : Opérations simples (filtrage, transformation).
* `StreamAvance.java` : Groupement (`groupingBy`), statistiques (`average`, `max`) et filtrage complexe sur des objets.
* `ComparateurCompose.java` : Tri multi-critères (par nom, puis par âge) utilisant `Comparator`.

### 4. Cas Pratiques & Algorithmes
* `ExceptionsLambda.java` : Gestion des "Checked Exceptions" (ex: `IOException`) dans les lambdas.
* `ValidationFormulaire.java` : Système de règles de validation extensible.
* `TraitementAsynchrone.java` : Exécution de tâches en parallèle avec `CompletableFuture`.
* `CompteurTODO.java` : Analyse de fichiers pour compter les occurrences de "TODO".
* `FactorielleStream.java` : Calcul mathématique utilisant `IntStream` et `reduce`.
* `Memoizer.java` : Optimisation par mise en cache des résultats de fonctions coûteuses.
* `TriFunctionDemo.java` : Création d'une interface fonctionnelle personnalisée à 3 arguments.

## 🚀 Installation et Exécution (Eclipse)

1.  **Créer le projet** :
    * File > New > Java Project > Nom : `TP15_Lambda`.
2.  **Créer le package** :
    * Dans `src`, créer un package nommé `ma.tp.lambda`.
3.  **Ajouter les fichiers** :
    * Copier les fichiers `.java` dans ce package.
4.  **Exécuter** :
    * Ouvrir un fichier (ex: `StreamAvance.java`).
    * Clic droit > Run As > Java Application.

## ⚠️ Notes Importantes

* **Classes Internes Statiques** : Dans certains fichiers (`StreamAvance`, `ComparateurCompose`), les classes modèles (ex: `PersonneStream`) ont été définies comme `static` à l'intérieur de la classe principale pour faciliter l'exécution et éviter les conflits de noms dans le package.
* **Java Version** : Assurez-vous que le "Compiler compliance level" de votre projet est réglé sur 1.8 ou plus.

---
*TP réalisé dans le cadre du module de Programmation Avancée.*
