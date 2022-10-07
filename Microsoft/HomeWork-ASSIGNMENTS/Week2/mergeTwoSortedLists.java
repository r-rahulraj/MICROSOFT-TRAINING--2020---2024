class Solution {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if(node1==null) return node2;
        if(node2==null) return node1;
        ListNode head=new ListNode();
        ListNode temp=new ListNode();
        if(node1.val<=node2.val){
            head=node1;
            temp=node1;
        }
        else {
            head=node2;
            temp=node2;
        }
        while(node1!=null && node2!=null) {
            if(node1.val<=node2.val) {
                if(node1!=head){
                    temp.next=node1;
                    temp=node1;
                }    
                node1=node1.next;
            } else {
                if(node2!=head) {
                    temp.next=node2;
                    temp=node2;
                }
                node2=node2.next;
            }
        }
        if(node1!=null) {
            temp.next=node1;
        }
        if(node2!=null) {
            temp.next=node2;
        }
        return head;
    }
}
