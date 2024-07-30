import java.util.*;

public class nextgreaterelement {
    public static int[] nextgreat(int[] nums) {
        int n = nums.length;
        int Nge[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (!stack.isEmpty()) {
                    Nge[i] = stack.peek();
                } else {
                    Nge[i] = -1;
                }
            }
            stack.push(nums[i % n]);
        }
        return Nge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = nextgreat(arr1);
        System.out.println("The next greater elements are:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
