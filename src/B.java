import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String[] species = new String[n];

        for (int i = 0; i < n; i++) {
            species[i] = scanner.nextLine().trim();
        }

        Arrays.sort(species, Comparator.comparingInt(String::length));
        String ancestor = species[0];

        for (int i = 1; i < n; i++) {
            if (!species[i].endsWith(ancestor)) {
                System.out.println("Not found");
                return;
            }
        }

        System.out.println(ancestor);
    }
}

