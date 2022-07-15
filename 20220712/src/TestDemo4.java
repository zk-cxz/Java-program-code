/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-07-15
 * Time: 19:20
 */
public class TestDemo4 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        ListNode head=new ListNode(0);
        ListNode cur=head;
        boolean flag=false;
        while(l1!=null&&l2!=null&&cur!=null){
            ListNode curNext=new ListNode(0);
            cur.next=curNext;
            int tmp=l1.val+l2.val;
            if(flag){
                tmp+=1;
                flag=false;
            }
            if(tmp>=10){
                tmp-=10;
                flag=true;
            }
            curNext.val=tmp;
            l1=l1.next;
            l2=l2.next;
            cur=cur.next;
        }
        while(l1!=null){
            cur.next=l1;
            if(flag){
                l1.val+=1;
                flag=false;
            }
            if(l1.val>=10){
                l1.val-=10;
                flag=true;
            }
            cur=cur.next;
            l1=l1.next;
        }
        while(l2!=null){
            cur.next=l2;
            if(flag){
                l2.val+=1;
                flag=false;
            }
            if(l2.val>=10){
                l2.val-=10;
                flag=true;
            }
            cur=cur.next;
            l2=l2.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(9);
        ListNode A=new ListNode(9);
        ListNode B=new ListNode(9);
        ListNode C=new ListNode(9);
        l1.next=A;
        A.next=B;
        B.next=C;
        ListNode l2=new ListNode(9);
        ListNode D=new ListNode(9);
        l2.next=D;
        addTwoNumbers(l1, l2);
    }
}
