package app;

import java.util.Random;

/**
 * Aleatoire
 */
public class Aleatoire {
    private Random generateur;

    public Aleatoire(long semence) {
        generateur = new Random(semence);
    }

    public int unEntier(int min, int max) throws Exception {
        if (min < 0 || min >= max)
            throw new Exception();
        int val = generateur.nextInt(max + 1 - min);
        return val + min;
    }

    public static void main(String[] args) {
        Aleatoire aleatoire = new Aleatoire(10);
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Aleatoire n° " + (i + 1) + " : " + aleatoire.unEntier(7, 15));
            }
        } catch (Exception e) {
        }
    }
}