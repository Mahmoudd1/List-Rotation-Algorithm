
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k==0|| head==null)
            return head;
        ListNode temphead=head;
        ListNode newHead=null;
        int len=0;
        while (temphead!=null)
        {
            len++;
            temphead=temphead.next;
        }
        k=len%k;
        if (k==0)
            return head;
        temphead=head;
        len=len-k;
        while (temphead.next!=null)
        {
            if (len==1)
            {
                newHead=temphead.next;
                temphead.next=null;
                temphead=newHead;
                continue;
            }
            temphead=temphead.next;
            len--;
        }
        temphead.next=head;
        return newHead;
    }
}