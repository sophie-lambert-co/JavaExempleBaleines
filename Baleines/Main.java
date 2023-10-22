package Baleines;



// Classe principale pour tester le polymorphisme
public class Main {
    public static void main(String[] args) {
        // Création d'un objet Rorqual
        MesBaleines.Rorqual monRorqual = new MesBaleines().new Rorqual();

        // Appel de la méthode seDeplacer()
        monRorqual.seDeplacer(); // Affiche : Le rorqual nage rapidement dans l'océan...
    }
}
