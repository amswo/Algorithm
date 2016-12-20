package algorithm.test1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int arr[][];
    static int size;
    static int temp[];
    static int result = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        arr = new int[size][size];
        temp = new int[size];
        StringTokenizer st ;
        for(int i=0; i<size; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++){
                arr[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        br.close();

        for(int i=0; i<size; i++){
            temp[i] = Triangle(i);
        }
        Arrays.sort(temp);
        System.out.println(temp[size-1]);
    }

    static int Triangle(int num){
        int temp_num = num;
        result = arr[size-1][num];
        for(int floor=size-2; floor>=0; floor--){
            if(floor == 0){
                result += arr[0][0];
            }else if(floor>0){
                if(temp_num == 0){
                    result += arr[floor][0];
                }else if(num == arr[floor].length-1){
                    result += arr[floor][temp_num];
                }else{
                    result += Math.max(arr[floor][temp_num] , arr[floor][temp_num-1]);
                    if(arr[floor][temp_num] < arr[floor][temp_num-1]){
                        temp_num = temp_num-1;
                    }
                }
            }
        }
        return result;
    }
}
