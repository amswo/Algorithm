package algorithm.test2920;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] music = new int[8];
        int[] compare = new int[8];
        for(int i=0; i<8; i++){
            music[i] = sc.nextInt();
            compare[i] = music[i];
        }
        Arrays.sort(compare);
        int a = 0 , d = 0, m = 0;
        for(int i=0; i<8; i++){
            if(music[i] == compare[i])
                a++;
            else if(music[i] == compare[8-(i+1)])
                d++;
            else
                m++;
        }
        if(a==8)
            System.out.println("ascending");
        else if(d==8)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}