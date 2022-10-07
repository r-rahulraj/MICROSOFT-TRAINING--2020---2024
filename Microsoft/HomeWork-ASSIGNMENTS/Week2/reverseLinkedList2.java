class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) {
            return head;
        }
        if(left==right) return head;
        int le=1,ri=1;
        int hlo=0,flag=0,sam=0;
        if(left!=le) {
            hlo=1;
        }
        ListNode p=null;
        ListNode q=head;
        ListNode r=head.next;
        ListNode ps=null;
        ListNode s=null;
        
        do {
            if(flag==0 && le==left) {
                if(hlo==1) ps=p;
                s=q;
                flag=1;
                p=q;
                q=r;
                r=r.next;
            } else if(flag==1) {
                if(ri==right) {
                    sam=1;
                    q.next=p;
                }
                else {
                    q.next=p;
                    p=q;
                    q=r;
                    r=r.next;
                }    
            } else {
                p=q;
                q=r;
                r=r.next;
            }
            le++;
            ri++;
            if(sam==0 && ri==right){
                if(hlo==1) ps.next=q;
                s.next=q.next;
            }
        } while(sam==0);
        if(hlo==0) return q;
        return head;
    }
}
