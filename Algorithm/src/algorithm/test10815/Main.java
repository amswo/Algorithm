package algorithm.test10815;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++)
            A[i] = sc.nextInt();
        qSort(A,0,A.length-1);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int temp = sc.nextInt();
            int num = (Arrays.binarySearch(A, temp) >= 0 ? 1 : 0);
            System.out.print(num + " ");
        }
    }
    static void qSort(int arr[], int left, int right){
        int pivot = arr[left];
        int l_hold = left;
        int r_hold = right;
        while(left < right){
            while((arr[right] >= pivot) && (left < right))
                right--;

            if(left!=right){
                arr[left] = arr[right];
            }

            while((arr[left] <= pivot) && (left<right))
                left++;

            if(left!=right){
                arr[right] = arr[left];
                right--;
            }
        }

        arr[left] = pivot;
        pivot = left;
        left = l_hold;
        right = r_hold;

        if(left<pivot)
            qSort(arr, left, pivot-1);
        if(right>pivot)
            qSort(arr, pivot+1, right);
    }
}