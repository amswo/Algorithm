package algorithm.test1741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++) {
            for(int k=1; k<=N-i; k++)
                out.write((" ").getBytes());
            for(int j=1; j<=i; j++)
                out.write(("*").getBytes());
            out.write(("\n").getBytes());
        }
        out.flush();
        br.close();
    }
}