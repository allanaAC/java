package oracleCodingTest;
import java.util.Stack;


    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public class QueueUsingStacks {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public QueueUsingStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enqueue(int x) {
            stack1.push(x);
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }

        public static ListNode processOperations(ListNode operations) {
            QueueUsingStacks queue = new QueueUsingStacks();
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            while (operations != null) {
                if (operations.val >= 0) {
                    queue.enqueue(operations.val);
                } else if (operations.val == -1) {
                    int result = queue.dequeue();
                    current.next = new ListNode(result);
                    current = current.next;
                }
                operations = operations.next;
            }

            return dummy.next;
        }

        public static void main(String[] args) {
            // Example usage
            ListNode operations = new ListNode(1);
            operations.next = new ListNode(2);
            operations.next.next = new ListNode(-1);
            operations.next.next.next = new ListNode(-1);
            operations.next.next.next.next = new ListNode(3);
            operations.next.next.next.next.next = new ListNode(-1);

            ListNode result = processOperations(operations);

            // Print the result
            while (result != null) {
                System.out.print(result.val + " ");
                result = result.next;
            }
        }
    }

