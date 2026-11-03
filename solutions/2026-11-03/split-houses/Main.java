import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in); int n=in.nextInt();String s=in.next();
if(s.contains("HH")){System.out.println("NO");}else{System.out.println("YES");System.out.println(s.replace('.','B'));}
 }
}
