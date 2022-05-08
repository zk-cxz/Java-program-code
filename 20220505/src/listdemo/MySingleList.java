package listdemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-05
 * Time: 20:39
 */
public class MySingleList {
    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;

    public void creatList(){
        ListNode listNode1=new ListNode(12);
        ListNode listNode2=new ListNode(23);
        ListNode listNode3=new ListNode(34);
        ListNode listNode4=new ListNode(45);
        ListNode listNode5=new ListNode(56);

        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        this.head=listNode1;
    }

    
}
