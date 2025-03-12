import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        StringBuilder s = new StringBuilder(words[0]);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                for (int j = 1; j < n; j++) {
                    if (words[j].charAt(i) != '.') {
                        s.setCharAt(i, words[j].charAt(i));
                        break;
                    }
                }
            }
        }
        System.out.println(s);
    }
}
