import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static class MyQueue<T> {
        Stack<T> stackNew = new Stack<T>();
        Stack<T> stackOld = new Stack<T>();

        public void enqueue(T value) {
            stackNew.push(value);
        }

        public T peek() {
            preparation();
            return stackOld.peek();
        }

        public T dequeue() {
            preparation();
            return stackOld.pop();
        }

        private void preparation() {
            if (stackOld.empty()) {
                while (!stackNew.empty()) {
                    stackOld.push(stackNew.pop());
                }
            }
        }
    }
    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

