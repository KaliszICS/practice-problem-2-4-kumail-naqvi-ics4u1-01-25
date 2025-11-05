public class PracticeProblem {

    public static void main(String[] args) {

    }

    public static void selectionSortName(String[] names, int[] ages) {
        if (names == null || ages == null || names.length != ages.length) return;

        for (int i = 0; i < names.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareToIgnoreCase(names[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                String tmpName = names[i];
                names[i] = names[min];
                names[min] = tmpName;
                int tmpAge = ages[i];
                ages[i] = ages[min];
                ages[min] = tmpAge;
            }
        }
    }

    public static void selectionSortAge(String[] names, int[] ages) {
        if (names == null || ages == null || names.length != ages.length) return;

        for (int i = 0; i < ages.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[j] < ages[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmpAge = ages[i];
                ages[i] = ages[min];
                ages[min] = tmpAge;
                String tmpName = names[i];
                names[i] = names[min];
                names[min] = tmpName;
            }
        }
    }
}
