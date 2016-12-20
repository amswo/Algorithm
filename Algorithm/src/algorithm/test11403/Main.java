package algorithm.test11403;

import java.io.*;
import java.util.Scanner;

public class Main {
    static int n;
    static int map[][];
    static int visit[];
    static int result[][];

    public static void main(String[] args) throws IOException{
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visit = new int[n];
        result = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            DFS(i);

            for(int j=0; j<n; j++){
                result[i][j] = 1;
                visit[j] = 0;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void DFS(int v){
        visit[v] += 1;
        for(int i=0; i<n; i++){
            if(map[v][i] == 1 && visit[i]==0){
                DFS(i);
            }
        }
    }
}