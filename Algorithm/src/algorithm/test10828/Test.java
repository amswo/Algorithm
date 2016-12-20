package algorithm.test10828;

import java.util.Scanner;

class Stack {
    int top;
    int[] stack;
    int size;

    public Stack(int size) {
        top = -1;
        stack = new int[size];
        this.size = size;
    }

    public void peek() {
        System.out.println(stack[top]);
    }

    public void push(int value) {
        stack[++top] = value;
    }

    public void pop() {
        if( top < 0 ){
            System.out.println("-1");
        }else{
            System.out.println(stack[top]);
            top--;
        }
    }

    public void empty(){
        if(top < 0)
            System.out.println("1");
        else
            System.out.println("0");
    }

    public void top(){
        if(top < 0)
            System.out.println("-1");
        else
            System.out.println(stack[top]);
    }
}
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack st = new Stack(n);
        for(int i=0; i<n; i++){
            String order = sc.next();
            switch (order){
                case "push":
                    st.push(sc.nextInt());
                    break;
                case "pop":
                    st.pop();
                    break;
                case "size":
                    System.out.println(st.top + 1);
                    break;
                case "empty":
                    st.empty();
                    break;
                case "top":
                    st.top();
                    break;
            }
        }
    }
}