// Mail du professeur de TP : gerald.ouvradou@imt.atlantique.fr
/**
 * SomethingTest
 */
public class SomethingTest {
    static int nbTests;
    static int nbTestsOK;
    static int nbTestsKO;

    //méthodes de test
    private static void TestInit() {
        nbTests = 0;
        nbTestsOK = 0;
        nbTestsKO = 0;
    }

    private static void testOK() {
        System.out.printf(".");
        nbTests++;
        nbTestsOK++;
    }

    private static void testKO(String errorMessage) {
        System.out.println("\n" + errorMessage);
        nbTests++;
        nbTestsKO++;
    }

    private static void testStats() {
        System.out.println(
                "\nNb of tests : " + nbTests + " ; Nb of success : " + nbTestsOK + " ; Nb of errors : " + nbTestsKO);
    }

    private static boolean containsTest() {
        int[] emptyTab = {};
        int[] tab = { 1, 2, 3 };
        return !contains(emptyTab, 1) && contains(tab, 3) && !contains(tab, 4);
    }

    private static boolean compareTest() {
        int[] emptyTab = {};
        int[] tab = { 1, 2, 3 };
        int[] shuffleTab = { 2, 3, 1 };
        return !compare(emptyTab, tab) && !compare(tab, emptyTab) && compare(tab, shuffleTab);
    }

    //méthodes utilitaire
    private static String tabToString(int[] tab) {
        String tabString = new String("[");
        for (int i = 0; i < tab.length; i++) {
            tabString = tabString.concat(String.valueOf(tab[i]));
            if (i != tab.length - 1)
                tabString = tabString.concat(",");
        }
        tabString = tabString.concat("]");
        return tabString;
    }

    private static boolean contains(int[] tab, int val) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == val) {
                return true;
            }
        }
        return false;
    }

    /**
     * Limitation : Ne compte pas le nombre d'occurences dans la comparaison
     */
    private static boolean compare(int[] tab1, int[] tab2) {
        if (tab1.length == 0 && tab2.length != 0)
            return false;
        for (int i = 0; i < tab1.length; i++) {
            if (!contains(tab2, tab1[i]))
                return false;
        }
        return true;
    }

    //main
    public static void main(String[] args) {
        Something something = new Something();
        TestInit();
        if (something.one() == 1)
            testOK();
        else
            testKO("Method one() don't return 1");

        for (int i = 0; i <= 100; i++) {
            if (something.foo(i) >= i)
                testOK();
            else
                testKO("Method foo() don't work with parameter " + i);
        }
        if (containsTest())
            testOK();
        else
            testKO("Methode contains() don't work");
        if (compareTest())
            testOK();
        else
            testKO("Methode compare() don't work");
        int[] tab = { 1, 2, 3 };
        System.out.println("\nAffichage du tableau : " + tabToString(tab));
        System.out.println("Affichage du tableau mélangé : " + tabToString(something.shuffle(tab)));
        testStats();
    }
}