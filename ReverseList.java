class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseList {
    public static void main(String[] args) {
        // Create a sample linked list: 1->2->3->4->5->6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Print the original linked list
        System.out.println("Original linked list:");
        printList(head);

        // Call the reorderList method
        reorderList(head);

        // Print the reordered linked list
        System.out.println("\nReordered linked list:");
        printList(head);
    }

    public static void reorderList(ListNode head) {
        if (head == null) return;

        // find the middle of linked list [Problem 876]
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second part of the list [Problem 206]
        ListNode prev = null, curr = slow, tmp;
        while (curr != null) {
            tmp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        // merge two sorted linked lists [Problem 21]
        ListNode first = head, second = prev;
        while (second.next != null) {
            tmp = first.next;
            first.next = second;
            first = tmp;

            tmp = second.next;
            second.next = first;
            second = tmp;
        }
    }

    // Utility method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

//Time - O(N)-> middle o(n), reverse 2nd part o(n/2), merge o(n/2)
//Space - O(1)
