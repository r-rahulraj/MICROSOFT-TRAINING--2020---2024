class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null) return head;
        int len=length(head);
        int pos=len-(k%len);
        if((k%len)==0) return head;
        ListNode tail=head;
        ListNode p=head;
        int a=1;
        while(tail.next!=null) {
            tail=tail.next;
        }
        while(a!=pos) {
            p=p.next;
            a++;
        }
        ListNode h=null;
        h=p.next;
        p.next=null;
        tail.next=head;
        return h;
    }
    public int length(ListNode node) {
        int len=0;
        while(node!=null) {
            len++;
            node=node.next;
        }
        return len;
    }
}
