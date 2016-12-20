package algorithm.test1003;

import java.io.*;

public class Main {
    static int result[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int num [] = new int[testcase];
        result = new int[testcase][2];
        for(int i=0; i<testcase; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<testcase; i++){
            result =  fibonacci(num[i], 0, 0, result, i);
        }
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] fibonacci(int n, int zero, int one, int arr[][], int i){
        arr[i][0] = zero;
        arr[i][1] = one;
        if(n==0){
            arr[i][0]++;
        }else if(n==1){
            arr[i][1]++;
        }else{
            fibonacci(n-1, arr[i][0],  arr[i][1], arr, i);
            fibonacci(n-2, arr[i][0], arr[i][1], arr, i);
        }
        return arr;
    }
}