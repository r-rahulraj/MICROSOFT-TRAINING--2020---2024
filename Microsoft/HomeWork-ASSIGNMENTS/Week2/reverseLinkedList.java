class Solution {
    ListNode p=null;
    ListNode s=null;
    ListNode ans=null;
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        s=head;
        reverse(head);
        return ans;
    }
    public void reverse(ListNode node) {
        if(node==s) p=s;
        else p=p.next;
        if(node.next==null) {
            ans=node;
            return;
        }
        reverse(node.next);
        p.next=node;
        p=node;
        if(node==s) {
            node.next=null;
        }
    }
}
