class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null) {
            return null;
        }
        if(head.next==null) {
            return head;
        }
        ListNode p=head;
        ListNode q=head.next;
        ListNode r=head.next.next;
        if(r==null) {
            p.next=null;
            q.next=p;
            return q;
        }
        head=q;
        while(p!=null && p.next!=null) {
            if(q.next==null) {
                p.next=null;
            }
            else if(q.next.next==null) {
                p.next=r;
            }
            else {
                p.next=q.next.next;
            }
            q.next=p;
            if(p==null || p.next==null) {
                return head;
            }
            p=r;
            if(p.next!=null) r=p.next.next;
            if(p!=null) q=p.next;
        }
        return head;
    }
}
