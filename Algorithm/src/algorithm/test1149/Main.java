package algorithm.test1149;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int house = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        int RGB[][] = new int[house][3];
        for(int i=0; i<house; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < RGB[i].length; j++) {
                RGB[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        br.close();
        int result[] = new int[3];
        for(int i=0; i<result.length; i++){
            result[i] = paintHouse(RGB, house-1, i);
        }
        Arrays.sort(result);
        System.out.println(result[0]);
    }

    public static int paintHouse(int rgb[][], int house, int color){
        int result = 0;
        if(house >= 0){
            if(color == 0){ // 마지막이 red
                result = rgb[house][color] + Math.min(paintHouse(rgb, house-1, color+1), paintHouse(rgb, house-1, color+2));
            }else if(color == 1){ // 마지막이 green
                result = rgb[house][color] + Math.min(paintHouse(rgb, house-1, color-1), paintHouse(rgb, house-1, color+1));
            }else if(color == 2){ // 마지막이 blue
                result = rgb[house][color] + Math.min(paintHouse(rgb, house-1, color-2), paintHouse(rgb, house-1, color-1));
            }
        }
        return result;
    }
}
