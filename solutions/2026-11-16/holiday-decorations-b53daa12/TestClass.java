import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] colors = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            colors[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer>[] adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<Integer>();

        if (N > 1) {
            st = new StringTokenizer(br.readLine());
            for (int i = 3; i <= N; i++) {
                int p = Integer.parseInt(st.nextToken());
                adj[i].add(p);
                adj[p].add(i);
            }
        }

        long beauty = 0;
        int[] sameColorNeighbors = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            for (int neighbor : adj[i]) {
                if (colors[i] == colors[neighbor]) {
                    sameColorNeighbors[i]++;
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            beauty += sameColorNeighbors[i];
        }
        beauty /= 2;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (colors[x] != y) {
                beauty -= sameColorNeighbors[x];
                for (int neighbor : adj[x]) {
                    if (colors[neighbor] == colors[x]) {
                        sameColorNeighbors[neighbor]--;
                    }
                }

                colors[x] = y;
                sameColorNeighbors[x] = 0;
                for (int neighbor : adj[x]) {
                    if (colors[neighbor] == colors[x]) {
                        sameColorNeighbors[x]++;
                        sameColorNeighbors[neighbor]++;
                    }
                }
                beauty += sameColorNeighbors[x];
            }
            sb.append(beauty).append("\n");
        }
        System.out.print(sb.toString());
    }
}