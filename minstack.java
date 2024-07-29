import java.util.*;

public class minstack {
    public static class pair {
        int x, y;

        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static class MinStack {
        Stack<pair> sttack;

        public MinStack() {
            sttack = new Stack<>();
        }

        public void push(int x) {
            int min;
            if (sttack.isEmpty()) {
                min = x;
            } else {
                min = Math.min(sttack.peek().y, x);
            }
            sttack.push(new pair(x, min));
        }

        public void pop() {
            sttack.pop();
        }

        public int top() {
            return sttack.peek().x;
        }

        public int getMin() {
            return sttack.peek().y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack minStack = new MinStack(); // Create an instance of MinStack

        System.out.println("Enter length of stack");
        int n = sc.nextInt();
        System.out.println("Enter elements of stack");
        for (int i = 0; i < n; i++) {
            minStack.push(sc.nextInt());
        }
        
        System.out.println("Top element: " + minStack.top());
        System.out.println("Minimum element: " + minStack.getMin());
    }
}
