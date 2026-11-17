import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tStr = br.readLine();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr.trim());
        while (t-- > 0) {
            String s = br.readLine();
            if (s == null) break;
            final int[] counts = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    counts[c - 'a']++;
                }
            }
            Character[] chars = new Character[26];
            for (int i = 0; i < 26; i++) {
                chars[i] = (char) ('a' + i);
            }
            Arrays.sort(chars, new Comparator<Character>() {
                @Override
                public int compare(Character c1, Character c2) {
                    int freq1 = counts[c1 - 'a'];
                    int freq2 = counts[c2 - 'a'];
                    if (freq1 != freq2) {
                        return Integer.compare(freq1, freq2);
                    } else {
                        return c2.compareTo(c1);
                    }
                }
            });
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(chars[i]);
                if (i < 25) {
                    sb.append(' ');
                }
            }
            System.out.println(sb.toString());
        }
    }
}