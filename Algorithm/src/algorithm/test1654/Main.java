package algorithm.test1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int K;
    static int N;
    static long first = 0;
    static long last = 2147483647;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        long line[] = new long[K];
        for(int i=0; i<K; i++){
            line[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(line);
        System.out.println(lineCut(line));
    }

    public static long lineCut(long[] arr){
        long mid = 0;
        long max = 0;
        while(first<=last){
            mid = (first+last)/2;
            int total = 0;
            for(int i=0; i<arr.length; i++){
                int result = (int)(arr[i]/mid);
                total += result;
            }
            if(total>=N){
                first = (long)(mid+1);
                if(max < mid){
                    max = mid;
                }
            }else{
                last = (long)(mid-1);
            }
        }
        return max;
    }
}
