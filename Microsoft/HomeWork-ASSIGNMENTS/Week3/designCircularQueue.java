class ListNode {
    int val;
    ListNode prev, next;
    public ListNode(int x) {
        val = x;
        prev = null;
        next = null;
    }
}

class MyCircularQueue {
    int queueSize, currSize;
    ListNode head, tail;

    public MyCircularQueue(int k) {
        queueSize = k;
        currSize = 0;
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = tail;
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        tail.prev = newNode;
        currSize++;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        ListNode toBeDeleted = head.next;
        head.next = toBeDeleted.next;
        toBeDeleted.next.prev = head;
        toBeDeleted.next = null;
        toBeDeleted.prev = null;
        currSize--;
        return true;
    }
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return head.next.val;
    }
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return tail.prev.val;
    }
    public boolean isEmpty() {
        return currSize == 0;
    }
    public boolean isFull() {
        return currSize == queueSize;
    }
}
