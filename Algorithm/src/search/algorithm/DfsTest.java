package search.algorithm;

import java.util.Scanner;

/**
 * Created by FocusNews on 2016-11-23.
 */
public class DfsTest {
    static int n;
    static int map[][] = new int[30][30];
    static int visit[] = new int[30];

    public static void main(String[] args){
        int start;
        int v1, v2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        start = sc.nextInt();

        while(true){
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            if(v1 == -1 && v2 == -1) break;
            map[v1][v2] = map[v2][v1] = 1;
        }
        DFS(start);
    }

    public static void DFS(int v){
        int i;
        visit[v] = 1;
        for(i=1; i<=n; i++){
            if(map[v][i] == 1 && visit[i]!=1){
                System.out.println(v + "에서 " + i + "로 이동");
                DFS(i);
            }
        }
    }
}
