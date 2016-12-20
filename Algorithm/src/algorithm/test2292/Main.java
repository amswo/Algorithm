package algorithm.test2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        int i = 0;
        int j = 0;
        while(true){
            if( num < (6*i+2) ) {
                System.out.println(j+1);
                break;
            }
            j++;
            i = i + j;
        }
    }
}
