package fr.dampierre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int heures;
        do {
            System.out.println("Veuillez entrer le nombre d'heures travaillées :");
            heures = scanner.nextInt();
        } while (heures < 0 || heures > 42);

        int salaire = 15 * heures;
        System.out.println("Le salaire est : " + salaire + " euros.");
    }
}
