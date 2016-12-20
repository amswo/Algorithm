package search.algorithm;

import java.util.Scanner;

public class BfsRoadTest {
    static int n, cnt; // 맵의 크기와 카운트 변수
    static int map [][] = new int[10][10];
    static int x[] = new int[100]; // 좌표의 길이를 담을 배열
    static int y[] = new int[100];
    static int l[] = new int[100];

    public static void main(String[] args) throws Exception{
        int i, j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=0; i<n; i++)
            for(j=0; j<n; j++)
                map[i][j] = sc.nextInt();
        BFS(0,0);
    }

    public static void BFS(int _x, int _y){
        int pos = 0;
        enqueue(_x, _y, 1); // 시작점의 좌표 정보와 길이를 큐에 삽입

        while(pos<cnt && (x[pos] != n-1 || y[pos] != n-1)){
            map[y[pos]][x[pos]] = 0;

            if(y[pos] > 0 && map[y[pos]-1][x[pos] -1] == 1) // 상
                enqueue(x[pos], y[pos] - 1, l[pos] + 1);
            if (y[pos] < n - 1 && map[y[pos] + 1][x[pos]] == 1) { // 하
                enqueue(x[pos], y[pos] + 1, l[pos] + 1);
            }
            if (x[pos] > 0 && map[y[pos]][x[pos] - 1] == 1) // 좌
                enqueue(x[pos] - 1, y[pos], l[pos] + 1);
            if (x[pos] < n - 1 && map[y[pos]][x[pos] + 1] == 1) { // 우
                enqueue(x[pos] + 1, y[pos], l[pos] + 1);
            }
            pos++;
        }
        if(pos<cnt)
            System.out.println("최단 경로 길이: " + l[pos]);
    }

    // 큐에 좌표정보와 길이를 넣을 함수
    public static void enqueue(int _x, int _y, int _l){
        x[cnt] = _x;
        y[cnt] = _y;
        l[cnt] = _l;
        cnt++;
    }
}
