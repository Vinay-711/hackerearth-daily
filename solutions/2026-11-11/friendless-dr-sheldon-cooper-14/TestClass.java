import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            if (!sc.hasNextInt()) break;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i < b; i++) {
                if (sc.hasNextInt()) sc.nextInt();
                if (sc.hasNextInt()) sc.nextInt();
            }
            System.out.println(a - 1);
        }
    }
}