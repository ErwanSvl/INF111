import java.util.*;

/**
 * userMarks
 */
public class userMarks {

    public static void main(String[] args) {
        Mark[] mathMarks;
        System.out.println("Initialisation du tableau des resultats en Mathematique");
        mathMarks = MarksManagement.initialize();
        MarksManagement.inputMarks(mathMarks);
        System.out.println("Moyenne Mathematique : " + MarksManagement.meanMark(mathMarks));
        System.out.println("Meilleure note en mathématique : " + MarksManagement.bestMark(mathMarks));
        System.out.println("Les résultats de mathématiques sont : ");
        MarksManagement.printMarks(mathMarks);
    }
}