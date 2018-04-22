package app;

import java.util.ArrayList;

/**
 * Table
 */
public class Table extends Meuble{
    private int maxChaises;
    private String forme;
    private Chaise[] chaises;
    private int nbChaises = 0;

    public Table(int maxChaises, String forme, float hauteur, float largeur, float longueur) {
        super(hauteur, largeur, hauteur);
        this.maxChaises = maxChaises;
        this.forme = forme;
        this.chaises = new Chaise[maxChaises];
    }

    public void ajouterChaise(Chaise chaise) {
        if(nbChaises < maxChaises) {
            chaises[i++] = chaise;
        } 
    }

    public void retirerChaise(Chaise chaise) {
        if(nbChaises > 0) {
            chaises[i--] = null;
        }
    }
}