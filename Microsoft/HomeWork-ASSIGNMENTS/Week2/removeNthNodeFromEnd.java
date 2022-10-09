class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null && n==1) return null;
        
        int len=0;
        ListNode x=head;
        while(x!=null) {
            len++;
            x=x.next;
        }
        ListNode p=null;
        ListNode q=head;
        int count=0;
        while(q!=null) {
            if(count==len-n) {
                if(count==0) {
                    head=q.next;
                    return head;
                }
                p.next=q.next;
                q.next=null;
                return head;
            }
            count++;
            p=q;
            q=q.next;
        }
        return head;
    }
}
