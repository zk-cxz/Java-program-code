package 力扣;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-08-13
 * Time: 13:52
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class reverse_nodes_in_k_group {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode Head = new ListNode();
        ListNode cur = Head;
        Stack<ListNode> stack = new Stack<>();
        Stack<ListNode> st = new Stack<>();
        while(head != null){
            int count = k;
            while(count > 0 && head != null){
                stack.push(head);
                head = head.next;
                count--;
            }
            if(head != null || (head == null && count == 0)){
                while(!stack.empty()){
                    cur.next = stack.pop();
                    cur = cur.next;
                    if(stack.empty()){
                        cur.next = null;
                    }
                }
            }else{
                while(!stack.empty()){
                    st.push(stack.pop());
                }
                while(!st.empty()){
                    cur.next = st.pop();
                    cur = cur.next;
                    if(stack.empty()){
                        cur.next = null;
                    }
                }
            }
        }
        return Head.next;
    }

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
/*        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);*/
        listNode1.next=listNode2;
/*        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5*/;
        ListNode Head=reverseKGroup(listNode1,2);
    }
}
