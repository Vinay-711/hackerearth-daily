// AI-assisted archived practice solution.
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        String word=new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        int z=0,o=0;
        for(char c:word.toCharArray()) {if(c=='z') z++; else if(c=='o') o++;}
        System.out.println(2*z==o ? "Yes" : "No");
    }
}
