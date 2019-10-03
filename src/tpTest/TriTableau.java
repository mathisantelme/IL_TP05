package tpTest;
/**
 * @author Les méthodes de tri sont issues de :
 *         http://pauillac.inria.fr/~levy/x/tc98/java/Tri.java
 *
 */
public class TriTableau {

    // Variables
    private int[] tab; // Le tableau à trier

    // Constructeurs
    public TriTableau(int[] p_tab) {

        this.tab = p_tab;
    }

    // Accesseurs
    public int getTabLength() {
        return this.tab.length;
    }

    public int[] getTab() {
        return this.tab;
    }

    // utilisé pour set un nouveau tableau
    public void setTab(int[] p_tab) {
        this.tab = p_tab;
    }

    // Méthodes

    @Override
    public String toString() {
        String str = "{";
        for (int i = 0; i < this.tab.length; i++)
            str += this.tab[i] + ", ";

        return str += "}";
    }

    public int[] triSelection() {
        int min; // le minimum
        int t;
        int[] sortedTab = this.getTab();

        for (int i = 0; i < this.getTabLength() - 1; ++i) {
            min = i;

            for (int j = i + 1; j < this.getTabLength(); ++j) {
                if (sortedTab[j] < sortedTab[min])
                    min = j;
            }
            t = sortedTab[min];
            sortedTab[min] = sortedTab[i];
            sortedTab[i] = t;

        }
        return sortedTab;
    }

    public int[] triBulle() {
        int t;
        int[] sortedTab = this.getTab();

        for (int i = this.getTabLength() - 1; i >= 0; --i)
            for (int j = 1; j <= i; ++j) {
                if (sortedTab[j - 1] > sortedTab[j]) {
                    t = sortedTab[j - 1];
                    sortedTab[j - 1] = sortedTab[j];
                    sortedTab[j] = t;
                }
            }

        return sortedTab;
    }

    public int[] triInsertion() {
        int j, v;
        int[] sortedTab = this.getTab();

        for (int i = 1; i < this.getTabLength() - 1; ++i) {
            v = sortedTab[i];
            j = i;
            while (j > 0 && sortedTab[j - 1] > v) {
                sortedTab[j] = sortedTab[j - 1];
                --j;
            }
            sortedTab[j] = v;
        }

        return sortedTab;
    }

    public int[] triShell() {
        int h;
        int[] sortedTab = this.getTab();

        h = 1;
        do
            h = 3 * h + 1;
        while (h <= this.getTabLength());
        do {
            h = h / 3;
            for (int i = h; i < this.getTabLength(); ++i)
                if (sortedTab[i] < sortedTab[i - h]) {
                    int v = sortedTab[i], j = i;
                    do {
                        sortedTab[j] = sortedTab[j - h];
                        j = j - h;
                    } while (j >= h && sortedTab[j - h] > v);
                    sortedTab[j] = v;
                }
        } while (h > 1);

        return sortedTab;
    }

    public void printTab(int[] p_tab) {
        for (int i = 0; i < p_tab.length; i++)
            System.out.print(p_tab[i] + ", ");
        System.out.println();
    }

    public static void main(String args[]) {

        int[] values = {10, 2, 3, 76, 20, 11, 87, 67};

        TriTableau triTableau = new TriTableau(values); // on créé le tableau

        triTableau.printTab(triTableau.triBulle());
        triTableau.printTab(triTableau.triInsertion());
        triTableau.printTab(triTableau.triShell());
        triTableau.printTab(triTableau.triSelection());
    }
}
