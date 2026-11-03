import java.io.*;
import java.util.*;
public class Main {
 static class Fast {byte[] b=new byte[65536];int p,l;int read()throws Exception{if(p==l){l=System.in.read(b);p=0;if(l<0)return -1;}return b[p++];}long next()throws Exception{int c;do{c=read();}while(c<=32&&c!=-1);long x=0;while(c>32){x=x*10+c-48;c=read();}return x;}}
 public static void main(String[] args)throws Exception{
  Fast in=new Fast();int t=(int)in.next();StringBuilder out=new StringBuilder();
  while(t-->0){int n=(int)in.next();int[] head=new int[n+1],to=new int[2*n-2],next=new int[2*n-2];Arrays.fill(head,-1);int edge=0;
   for(int i=1;i<n;i++){int u=(int)in.next(),v=(int)in.next();to[edge]=v;next[edge]=head[u];head[u]=edge++;to[edge]=u;next[edge]=head[v];head[v]=edge++;}
   long[] sum=new long[n+1];for(int i=1;i<=n;i++)sum[i]=in.next();
   int levels=32-Integer.numberOfLeadingZeros(n);int[][] up=new int[levels][n+1];int[] order=new int[n];order[0]=1;int tail=1;
   for(int at=0;at<tail;at++){int u=order[at];for(int e=head[u];e!=-1;e=next[e]){int v=to[e];if(v==up[0][u])continue;up[0][v]=u;sum[v]+=sum[u];order[tail++]=v;}}
   for(int k=1;k<levels;k++)for(int u=1;u<=n;u++)up[k][u]=up[k-1][up[k-1][u]];
   int q=(int)in.next();while(q-->0){int u=(int)in.next();long rebels=in.next(),initial=sum[u];for(int k=levels-1;k>=0;k--){int ancestor=up[k][u];if(ancestor!=0&&initial-sum[ancestor]<rebels)u=ancestor;}out.append(u).append('\n');}
  }System.out.print(out);
 }
}