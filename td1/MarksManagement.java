import java.util.Scanner;

/**
 * MarksManagement
 */
public class MarksManagement {

    public static Mark[] initialize() {
        int nbStudent;
        Scanner scan = new Scanner(System.in);
        System.out.println("Combien d'élèves?");
        nbStudent = scan.nextInt();
        return new Mark[nbStudent];
    }

    public static void inputMarks(Mark[] marks) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisie de toutes les notes : ");
        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Nom de l'étudiant?");
            String name = scan.next();
            System.out.println("Note de l'étudiant?");
            int mark = scan.nextInt();
            marks[i] = new Mark(name, mark);
        }
    }

    public static void printMarks(Mark[] marks) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Nom : " + marks[i].getName() + " note : " + marks[i].getMark());   
        }
    }

    public static float meanMark(Mark[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i].getMark();
        }
        return (float)sum/marks.length;
    }

    public static int bestMark(Mark[] marks) {
        int bestMark = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i].getMark() > bestMark) {
                bestMark = marks[i].getMark();
            }
        }
        return bestMark;
    }
}