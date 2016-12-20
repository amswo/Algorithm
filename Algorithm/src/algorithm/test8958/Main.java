package algorithm.test8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        String[] quiz = new String[test];
        for(int i=0; i<test; i++){
            quiz[i] = br.readLine();
        }
        br.close();
        int result[] = new int[test];
        for(int i=0; i<test; i++){
            int cnt = 0;
            for(int j=0; j<quiz[i].length(); j++){
                if(quiz[i].charAt(j) == 'O') {
                    cnt++;
                    result[i] += cnt;
                }else
                    cnt = 0;
            }
        }
        for (int i=0; i<test; i++)
            System.out.println(result[i]);
    }
}