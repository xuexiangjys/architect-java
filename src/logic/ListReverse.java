package logic;

/**
 * 链表反转
 *
 * @author xuexiang
 * @since 2020/3/1 3:11 PM
 */
public class ListReverse {


    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }

        public Node setNext(Node next) {
            this.next = next;
            return this;
        }
    }


    /**
     * 链表反转的方法【递归法】
     *
     * @param head
     * @return
     */
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }


    /**
     * 遍历链表打印
     *
     * @param head
     */
    public static void printNode(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        System.out.println(temp.value);
        while (temp.next != null) {
            System.out.println(temp.next.value);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        System.out.println("=====反转前=====");
        printNode(head);

        System.out.println("=====反转后=====");
        printNode(reverse(head));

    }

}
