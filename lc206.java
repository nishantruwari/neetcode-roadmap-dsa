class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }

        if(head.next.next==null){
            ListNode temp=head.next;
            temp.next=head;
            head.next=null;
            head=temp;
            return head;
        }
        
        ListNode temp1=head.next;
        ListNode temp2=head.next.next;
        head.next=null;
        while(temp2.next!=null){
            temp1.next=head;
            head=temp1;
            temp1=temp2;
            temp2=temp2.next;
        }
        temp1.next=head;
        temp2.next=temp1;
        head=temp2;
        return head;

        
    }
}
