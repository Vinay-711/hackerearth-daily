import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            int z = 0, o = 0;
            for (char c : s.toCharArray()) {
                if (c == 'z') z++;
                else if (c == 'o') o++;
            }
            System.out.println(2 * z == o ? "Yes" : "No");
        }
    }
}