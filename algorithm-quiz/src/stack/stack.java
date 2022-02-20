package stack;

import java.util.Scanner;

/*
 * 문제 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 
 * 명령은 총 다섯 가지이다.
 * 
 * push X: 정수 X를 스택에 넣는 연산이다. 
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
     =>만약 스택에 들어있는 정수가 없는 경우에는 -1을  출력한다. 
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다. 
 * top: 스택의 가장 위에 있는 정수를 출력한다.
    => 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class stack {

  public static int[] stack;
  public static int size = 0;

  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int N = in.nextInt();
    stack = new int[N];

    while(true) {
      String input = in.nextLine();
      switch  (input) {
        case "push": push(in.nextInt()); break;
        case "pop" : pop(); break;
        case "size": size(); break;
        case "empty": empty(); break;
        case "top" : top(); break;
      }

    }
  }
  public static void push(int item) {
    stack[size++] = item;
  }

  public static int pop() {
    if(size == 0) {
      return -1;
    }

    int res = stack[size - 1];
    stack[(size--) - 1] = 0;// null로 초기화가 안되는 이유?
    return res;

  }

  public static int size() {
    return size;
  }

  public static int empty() {
    if(size == 0) {
      return 1;
    } else {
      return 0;
    }
  }

  //if - else와 비교 
  public static int top() {
    if(size == 0) {
      return -1;
    }
    return stack[size - 1];
  }
}