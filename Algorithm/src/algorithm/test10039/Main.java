package algorithm.test10039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] student = new int[5];
        int result = 0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            int temp = Integer.valueOf(br.readLine().trim());
            if(temp < 40)
                student[i] = 40;
            else
                student[i] = temp;
            result += student[i];
        }
        br.close();
        System.out.println(result/5);
    }
}