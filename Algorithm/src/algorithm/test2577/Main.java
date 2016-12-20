package algorithm.test2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num[] = new int[3];
        int result = 1;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            num[i] = sc.nextInt();
            result *= num[i];
        }
        while(result!=0){
            switch (result%10){
                case 0:
                    arr[0]++;
                    break;
                case 1:
                    arr[1]++;
                    break;
                case 2:
                    arr[2]++;
                    break;
                case 3:
                    arr[3]++;
                    break;
                case 4:
                    arr[4]++;
                    break;
                case 5:
                    arr[5]++;
                    break;
                case 6:
                    arr[6]++;
                    break;
                case 7:
                    arr[7]++;
                    break;
                case 8:
                    arr[8]++;
                    break;
                case 9:
                    arr[9]++;
                    break;
            }
            result /= 10;
        }
        for(int i=0; i<10; i++)
            System.out.println(arr[i]);
    }
}