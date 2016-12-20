package search.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class DfsRoadTest {
    static int n, min; // 맵의 크기와 경로최소값 m
    static int map[][] = new int[5][5]; // 맵 정보

    public static void main(String[] args) throws IOException{
        int i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        min = n*n;
        for(i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(j =0; j<n; j++)
                map[i][j] = Integer.valueOf(st.nextToken());
        }
        DFS(0,0,1);
        br.close();
        System.out.println("최단거리: " + min);
    }

    public static void DFS(int x, int y, int l){
        if(x==n-1 && y==n-1){
            if(min > l) min = l;
            return;
        }
        // 상하좌우
        map[y][x] = 0;

        if(y>0 && map[y-1][x] != 0) DFS(x, y-1, l+1);
        if(y<n-1 && map[y+1][x] != 0) DFS(x, y+1, l+1);
        if(x>0 && map[y][x-1] != 0) DFS(x-1, y, l+1);
        if(x<n-1 && map[y][x+1] !=0) DFS(x+1, y, l+1);

        map[y][x] = 1;
    }
}
