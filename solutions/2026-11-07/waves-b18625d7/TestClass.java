import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;

public class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ci = sc.nextInt();
        int cj = sc.nextInt();
        
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int dist = Math.max(Math.abs(i - ci), Math.abs(j - cj));
                out.print(dist);
                if (j < c - 1) {
                    out.print(" ");
                }
            }
            out.println();
        }
        out.flush();
        out.close();
        sc.close();
    }
}