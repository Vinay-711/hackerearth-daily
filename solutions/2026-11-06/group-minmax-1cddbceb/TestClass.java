import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) return;
        long A = sc.nextLong();
        if (!sc.hasNextLong()) return;
        long B = sc.nextLong();
        
        long minConnections = calculateMin(A, B);
        long maxConnections = calculateMax(A, B);
        
        System.out.println(minConnections + " " + maxConnections);
    }

    private static long calculateMin(long A, long B) {
        long baseSize = A / B;
        long remainder = A % B;
        
        long group1Count = remainder;
        long group2Count = B - remainder;
        
        long size1 = baseSize + 1;
        long size2 = baseSize;
        
        long connections = 0;
        if (size1 > 1) {
            connections += group1Count * (size1 * (size1 - 1) / 2);
        }
        if (size2 > 1) {
            connections += group2Count * (size2 * (size2 - 1) / 2);
        }
        return connections;
    }

    private static long calculateMax(long A, long B) {
        long n = A - B + 1;
        return n * (n - 1) / 2;
    }
}