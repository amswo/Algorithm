package algorithm.test2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int x){
        if(x==0)
            return 0;
        else if(x==1)
            return 1;
        else
            return fibonacci(x-1) + fibonacci(x-2);
    }
}
