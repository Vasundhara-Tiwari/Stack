package stack;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;           //can be a generic type
        private ListNode next;      //References to next ListNode in the list

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
}
