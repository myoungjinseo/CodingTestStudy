import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            set1.add(sc.next());
        }
        for (int i = 0; i < n2; i++) {
            set2.add(sc.next());
        }
        set1.retainAll(set2);
        System.out.println(set1.size());
        set1.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
